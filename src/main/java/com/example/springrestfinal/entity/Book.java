package com.example.springrestfinal.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "BOOK")
@SequenceGenerator(name="book_seq", initialValue=5)
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="book_seq")
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "ISBN")
    private String isbn;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "RELEASE_DATE")
    private Date releaseDate;

    @Column(name="AUTHOR_ID")
    private Integer authorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
