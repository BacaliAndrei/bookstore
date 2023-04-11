package com.sda.bookstore.entity;

import jakarta.persistence.*;


@Entity
public class BookEntity {//TODO: -adauga cantitate
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer price;
    @Column
    private Integer numberOfChapters;
    @Column
    private String bookTitle;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private AuthorsEntity author;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private OrderEntity order;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumberOfChapters() {
        return numberOfChapters;
    }

    public void setNumberOfChapters(Integer numberOfChapters) {
        this.numberOfChapters = numberOfChapters;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
