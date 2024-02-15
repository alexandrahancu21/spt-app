package com.example.springrestfinal.controller;

import com.example.springrestfinal.entity.Book;
import com.example.springrestfinal.service.BookService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") Integer id){
        return bookService.getBook(id);
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") Integer id){
        bookService.deleteBook(id);
    }

    @GetMapping("/findByAuthor")
    public List<Book> findByAuthor(@PathParam("authorId") Integer authorId) {
        return bookService.findByAuthor(authorId);
    }
}
