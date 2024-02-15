package com.example.springrestfinal.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "AUTHOR")
@SequenceGenerator(name="author_seq", initialValue=4)
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator="author_seq")
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    @Column(name = "CITY")
    private String city;
    
    @Column(name="COUNTRY")
    private String country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
