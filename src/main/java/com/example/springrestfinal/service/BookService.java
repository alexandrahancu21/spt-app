package com.example.springrestfinal.service;


import com.example.springrestfinal.entity.Book;
import com.example.springrestfinal.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBook(Integer id){
        return bookRepository.findById(id).get();
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Integer id){
        bookRepository.deleteById(id);
    }

    public List<Book> findByAuthor(Integer authorId) {
        return bookRepository.findByAuthorIdOrderByReleaseDateAsc(authorId);
    }

}
