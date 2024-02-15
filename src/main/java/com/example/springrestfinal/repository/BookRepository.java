package com.example.springrestfinal.repository;


import com.example.springrestfinal.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
     List<Book> findByAuthorIdOrderByReleaseDateAsc(Integer authorId);
}
