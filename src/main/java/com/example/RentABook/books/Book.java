package com.example.RentABook.books;

import com.example.RentABook.genres.Genre;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Book implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String author;
    private byte[] picture;
    @Column(name = "content_ref")
    private String contentRef;
    @ManyToOne(targetEntity = Genre.class, fetch = FetchType.LAZY)
    @JoinColumn(name="genre",insertable = false, updatable = false, referencedColumnName = "id")
    private Genre genre;
    @Column(name = "genre_id")
    private Long genreId;

    public Book() {
    }

    public Book(Long id, String title, String description, String author, byte[] picture, String contentRef, Long genreId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.picture = picture;
        this.contentRef = contentRef;
        this.genreId = genreId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getContentRef() {
        return contentRef;
    }

    public void setContentRef(String contentRef) {
        this.contentRef = contentRef;
    }

    public Long getGenreId() {
        return genreId;
    }

    public void setGenreId(Long genreId) {
        this.genreId = genreId;
    }
}
