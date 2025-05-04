package api.controllers;

import models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable String id, @RequestBody Book updatedBook) {
        Book result = bookService.updateBook(id, updatedBook);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/{id}/checkout")
    public ResponseEntity<String> checkoutBook(@PathVariable String id) {
        bookService.checkoutBook(id);
        return ResponseEntity.ok("Book " + id + " checked out successfully.");
    }
}

