package com.sda.bookstore.convertor;

import com.sda.bookstore.dto.BookCreateDTO;
import com.sda.bookstore.entity.BookEntity;

public class BookConvertor {

    public static BookEntity convertToBookEntity(BookCreateDTO bookCreateDTO){

        BookEntity book= new BookEntity();
        book.setPrice(bookCreateDTO.getPrice());
        book.setNumberOfChapters(bookCreateDTO.getNumberOfChapters());
        book.setBookTitle(bookCreateDTO.getBookTitle());
        return book;
    }

}
