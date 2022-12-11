package com.example.RentABook.genres;

import com.example.RentABook.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/genres")
public class GenresController {
    private final GenresService genresService;

    @Autowired
    public GenresController(GenresService genresService) {
        this.genresService = genresService;
    }

    @PostMapping()
    public void addNewGenre(@RequestBody Genres genre) {
        genresService.addNewGenre(genre);
    }

    @GetMapping()
    public List<Genres> getGenres() {
        return genresService.getGenres();
    }
}
