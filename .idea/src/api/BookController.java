package api;

import models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // GET /api/books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // POST /api/books
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // PUT /api/books/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable String id, @RequestBody Book updatedBook) {
        Book result = bookService.updateBook(id, updatedBook);
        return ResponseEntity.ok(result);
    }

    // POST /api/books/{id}/checkout
    @PostMapping("/{id}/checkout")
    public ResponseEntity<Book> checkoutBook(@PathVariable String id) {
        Book checkedOut = bookService.checkoutBook(id);
        return ResponseEntity.ok(checkedOut);
    }
}
