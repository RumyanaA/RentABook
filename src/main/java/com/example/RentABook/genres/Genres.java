package com.example.RentABook.genres;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Genres implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    public Genres() {
    }

    public Genres(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
