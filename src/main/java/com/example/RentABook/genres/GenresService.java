package com.example.RentABook.genres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenresService {
    private final GenresRepository genresRepository;

    @Autowired
    public GenresService(GenresRepository genresRepository) {
        this.genresRepository = genresRepository;
    }

    public void addNewGenre(Genres genre){
        // handle exception if name exists
        genresRepository.save(genre);
    }

    public List<Genres> getGenres(){
        return genresRepository.getAllGenres();
    }
}
