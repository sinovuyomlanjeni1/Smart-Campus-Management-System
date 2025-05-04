package tests;

import models.Book;
import models.UserAccount;
import repositories.BookRepository;
import services.BookService;
import exceptions.BookAlreadyCheckedOutException;
import exceptions.BookNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceTest {

    private BookRepository bookRepo;
    private BookService bookService;
    private UserAccount user;

    @BeforeEach
    public void setUp() {
        // Dummy in-memory book repository for testing
        bookRepo = new BookRepository() {
            private Map<String, Book> books = new HashMap<>();

            {
                books.put("B001", new Book("B001", "Java Basics", false));
                books.put("B002", new Book("B002", "Clean Code", false));
            }

            @Override
            public Optional<Book> findById(String id) {
                return Optional.ofNullable(books.get(id));
            }

            @Override
            public Book save(Book book) {
                books.put(book.getId(), book);
                return book;
            }

            @Override
            public List<Book> findByUserId(String userId) {
                List<Book> result = new ArrayList<>();
                for (Book b : books.values()) {
                    if (userId.equals(b.getBorrowedBy())) {
                        result.add(b);
                    }
                }
                return result;
            }
        };

        user = new UserAccount("U100", "John Doe", "john@example.com", "123", "active");
        bookService = new BookService(bookRepo);
    }

    @Test
    public void testCheckoutBookSuccessfully() {
        Book book = bookService.checkoutBook("B001", user);
        assertTrue(book.isCheckedOut());
        assertEquals("U100", book.getBorrowedBy());
    }

    @Test
    public void testCheckoutBook_AlreadyCheckedOut() {
        bookService.checkoutBook("B001", user);
        assertThrows(BookAlreadyCheckedOutException.class, () -> {
            bookService.checkoutBook("B001", user);
        });
    }

    @Test
    public void testCheckoutBook_BookNotFound() {
        assertThrows(BookNotFoundException.class, () -> {
            bookService.checkoutBook("UNKNOWN", user);
        });
    }

    @Test
    public void testCheckoutBook_BorrowLimitExceeded() {
        // Simulate user already borrowing 5 books
        for (int i = 0; i < 5; i++) {
            Book book = new Book("B00" + (i + 3), "Dummy " + i, false);
            book.setBorrowedBy("U100");
            bookRepo.save(book);
        }

        assertThrows(IllegalStateException.class, () -> {
            bookService.checkoutBook("B002", user);
        });
    }
}

