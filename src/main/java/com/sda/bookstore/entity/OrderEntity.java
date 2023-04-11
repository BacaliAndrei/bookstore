package com.sda.bookstore.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class OrderEntity {// TODO: -adauga cantitate
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String description;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BookEntity> books;



    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }


}

