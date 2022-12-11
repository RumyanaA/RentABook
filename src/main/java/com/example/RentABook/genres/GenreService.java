package com.example.RentABook.genres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public void addNewGenre(Genre genre){
        // handle exception if name exists
        genreRepository.save(genre);
    }

    public List<Genre> getGenres(){
        return genreRepository.getAllGenres();
    }
}
