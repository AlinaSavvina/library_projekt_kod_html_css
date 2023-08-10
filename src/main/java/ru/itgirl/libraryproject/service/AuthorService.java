package ru.itgirl.libraryproject.service;

import ru.itgirl.libraryproject.dto.AuthorDto;
import ru.itgirl.libraryproject.dto.BookDto;
import ru.itgirl.libraryproject.model.Author;

import java.util.List;
import java.util.Optional;


public interface AuthorService {
    AuthorDto getAuthorById(Long id);

    AuthorDto getByName(String name);

    AuthorDto getByNameN3(String name);

    AuthorDto getByNameN2(String name);
    List<BookDto> getBooksByAuthor(Author author);
}
