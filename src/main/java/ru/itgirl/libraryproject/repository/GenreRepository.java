package ru.itgirl.libraryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itgirl.libraryproject.model.Genre;

import java.awt.print.Book;
import java.util.List;


public interface GenreRepository extends JpaRepository<Genre, Long> {
    @Repository
    public interface BookRepository extends JpaRepository<Book, Long> {

        List<Book> findByGenre(Genre genre);
    }

}
