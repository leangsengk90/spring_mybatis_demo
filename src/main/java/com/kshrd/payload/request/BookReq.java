package com.kshrd.payload.request;

import java.time.LocalDateTime;

public class BookReq {

    private String name;
    private LocalDateTime importDate;
    private int authorId;

    public BookReq() {
    }

    public BookReq(String name, LocalDateTime importDate, int authorId) {
        this.name = name;
        this.importDate = importDate;
        this.authorId = authorId;
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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "BookReq{" +
                "name='" + name + '\'' +
                ", importDate=" + importDate +
                ", authorId=" + authorId +
                '}';
    }
}
