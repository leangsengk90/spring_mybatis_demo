package com.kshrd.payload.response;

import java.time.LocalDateTime;

public class BookRes {

    private int id;
    private String name;
    private LocalDateTime importDate;
    private int authorId;

    public BookRes() {
    }

    public BookRes(int id, String name, LocalDateTime importDate, int authorId) {
        this.id = id;
        this.name = name;
        this.importDate = importDate;
        this.authorId = authorId;
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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "BookRes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", importDate=" + importDate +
                ", authorId=" + authorId +
                '}';
    }
}
