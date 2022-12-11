package com.example.RentABook.genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GenresRepository extends JpaRepository<Genres,Long> {
    @Query("select g from Genres g order by g.name")
    List<Genres> getAllGenres();
}
