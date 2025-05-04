package services;

import java.awt.print.Book;
import models.Book;
import repositories.BookRepository;


public class BookService {
    private final BookRepository bookRepo;

    public BookService(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Book checkoutBook(String bookId) {
        Book book = bookRepo.findById(bookId);
        if (book == null) {
            throw new IllegalArgumentException("Book not found: " + bookId);
        }
        if (book.isCheckedOut()) {
            throw new IllegalStateException("Book is already checked out: " + bookId);
        }
        book.checkOut();
        return bookRepo.save(book);
    }

    public Book returnBook(String bookId) {
        Book book = bookRepo.findById(bookId);
        if (book == null) {
            throw new IllegalArgumentException("Book not found: " + bookId);
        }
        if (!book.isCheckedOut()) {
            throw new IllegalStateException("Book is not currently checked out: " + bookId);
        }
        book.returnBook();
        return bookRepo.save(book);
    }
}