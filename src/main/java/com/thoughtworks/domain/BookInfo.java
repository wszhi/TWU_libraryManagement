package com.thoughtworks.domain;

import java.util.Date;

public class BookInfo {
    private String bookId;
    private String bookName;
    private String bookAuthor;
    private String bookImage;
    private Date bookPublish;
    private String bookIntroduce;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public Date getBookPublish() {
        return bookPublish;
    }

    public void setBookPublish(Date bookPublish) {
        this.bookPublish = bookPublish;
    }

    public String getBookIntroduce() {
        return bookIntroduce;
    }

    public void setBookIntroduce(String bookIntroduce) {
        this.bookIntroduce = bookIntroduce;
    }
}
