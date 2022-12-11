package com.example.RentABook.genres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/genres")
public class GenreController {
    private final GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @PostMapping()
    public void addNewGenre(@RequestBody Genre genre) {
        genreService.addNewGenre(genre);
    }

    @GetMapping()
    public List<Genre> getGenres() {
        return genreService.getGenres();
    }
}
