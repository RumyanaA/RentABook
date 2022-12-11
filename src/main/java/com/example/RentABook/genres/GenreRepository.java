package com.example.RentABook.genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre,Long> {
    @Query("select g from Genre g order by g.name")
    List<Genre> getAllGenres();
}
