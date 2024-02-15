package com.example.springrestfinal.service;

import com.example.springrestfinal.entity.Author;
import com.example.springrestfinal.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors(){
        return authorRepository.findAll();
    }

    public Author getAuthor(Long id){
        return authorRepository.findById(id).get();
    }

    public Author saveAuthor(Author author){
        return authorRepository.save(author);
    }

    public void deleteAuthor(long id){
    	authorRepository.deleteById(id);
    }

    public List<Author> findByCountry(String country) {
        return authorRepository.findByCountryOrderByBirthDateAsc(country);
    }

}
