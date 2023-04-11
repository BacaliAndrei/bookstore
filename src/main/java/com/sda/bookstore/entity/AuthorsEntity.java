package com.sda.bookstore.entity;

import jakarta.persistence.*;

@Entity
public class AuthorsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private Integer numberOfBooksWritten;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private BookEntity bookTitle;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumberOfBooksWritten() {
        return numberOfBooksWritten;
    }

    public void setNumberOfBooksWritten(Integer numberOfBooksWritten) {
        this.numberOfBooksWritten = numberOfBooksWritten;
    }

}
