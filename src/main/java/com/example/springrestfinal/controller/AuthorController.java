package com.example.springrestfinal.controller;

import com.example.springrestfinal.entity.Author;
import com.example.springrestfinal.service.AuthorService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable("id") long id){
        return authorService.getAuthor(id);
    }

    @PostMapping
    public Author saveAuthor(@RequestBody Author author){
        return authorService.saveAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable("id") long id){
    	authorService.deleteAuthor(id);
    }

    @GetMapping("/findByCountry")
    public List<Author> findByCountry(@PathParam("country") String country) {
        return authorService.findByCountry(country);
    }
}
