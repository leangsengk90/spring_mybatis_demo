package com.kshrd.model;

import java.time.LocalDateTime;

public class Book {
    private int id;
    private String name;
    private LocalDateTime importDate;
    private Author author;

    public Book() {
    }

    public Book(int id, String name, LocalDateTime importDate, Author author) {
        this.id = id;
        this.name = name;
        this.importDate = importDate;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getImportDate() {
        return importDate;
    }

    public void setImportDate(LocalDateTime importDate) {
        this.importDate = importDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", importDate=" + importDate +
                ", author=" + author +
                '}';
    }
}
