package com.example.springrestfinal.repository;

import com.example.springrestfinal.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByCountryOrderByBirthDateAsc(String country);
}
