package services;

import models.Book;
import models.UserAccount;
import repositories.BookRepository;
import repositories.UserRepository;

import java.util.List;
public class UserService {
    private final UserRepository userRepo;
    private final BookRepository bookRepo;

    public UserService(UserRepository userRepo, BookRepository bookRepo) {
        this.userRepo = userRepo;
        this.bookRepo = bookRepo;
    }

    public String borrowBook(String userId, String bookId) {
        UserAccount user = userRepo.findById(userId);
        if (user == null) {
            throw new IllegalArgumentException("User not found: " + userId);
        }

        Book book = bookRepo.findById(bookId);
        if (book == null) {
            throw new IllegalArgumentException("Book not found: " + bookId);
        }

        List<Book> borrowedBooks = bookRepo.findByUserId(userId);
        if (borrowedBooks.size() >= 5) {
            throw new IllegalStateException("User has reached borrow limit.");
        }

        book.setCheckedOut(true);
        book.setBorrowedBy(userId);
        bookRepo.save(book);
        return "Book borrowed successfully.";
    }

    public List<Book> getUserBooks(String userId) {
        return bookRepo.findByUserId(userId);
    }
}