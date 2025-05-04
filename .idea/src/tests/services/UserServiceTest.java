package tests;

import models.Book;
import models.UserAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.BookRepository;
import repositories.UserRepository;
import services.UserService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    private UserRepository userRepo;
    private BookRepository bookRepo;
    private UserService userService;

    @BeforeEach
    public void setUp() {
        userRepo = mock(UserRepository.class);
        bookRepo = mock(BookRepository.class);
        userService = new UserService(userRepo, bookRepo);
    }

    @Test
    public void testBorrowBook_Successful() {
        UserAccount user = new UserAccount("U1", "Alice", "a@mail.com", "123", "active");
        Book book = new Book("B1", "Java Programming");

        when(userRepo.findById("U1")).thenReturn(user);
        when(bookRepo.findById("B1")).thenReturn(book);
        when(bookRepo.findByUserId("U1")).thenReturn(new ArrayList<>());

        String result = userService.borrowBook("U1", "B1");
        assertEquals("Book borrowed successfully.", result);
        assertTrue(book.isCheckedOut());
        assertEquals("U1", book.getBorrowedBy());
        verify(bookRepo).save(book);
    }

    @Test
    public void testBorrowBook_UserNotFound() {
        when(userRepo.findById("U2")).thenReturn(null);
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> userService.borrowBook("U2", "B1"));
        assertEquals("User not found: U2", ex.getMessage());
    }

    @Test
    public void testBorrowBook_BookNotFound() {
        UserAccount user = new UserAccount("U1", "Alice", "a@mail.com", "123", "active");
        when(userRepo.findById("U1")).thenReturn(user);
        when(bookRepo.findById("B99")).thenReturn(null);

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> userService.borrowBook("U1", "B99"));
        assertEquals("Book not found: B99", ex.getMessage());
    }

    @Test
    public void testBorrowBook_ExceedsLimit() {
        UserAccount user = new UserAccount("U1", "Alice", "a@mail.com", "123", "active");
        Book book = new Book("B1", "Java Programming");

        List<Book> borrowed = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            borrowed.add(new Book("B" + i, "Title" + i));
        }

        when(userRepo.findById("U1")).thenReturn(user);
        when(bookRepo.findById("B1")).thenReturn(book);
        when(bookRepo.findByUserId("U1")).thenReturn(borrowed);

        Exception ex = assertThrows(IllegalStateException.class,
                () -> userService.borrowBook("U1", "B1"));
        assertEquals("User has reached borrow limit.", ex.getMessage());
    }
}
