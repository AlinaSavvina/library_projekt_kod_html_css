package ru.itgirl.libraryproject.service;

import ru.itgirl.libraryproject.dto.BookDto;
import ru.itgirl.libraryproject.model.Author;

import java.util.List;
import java.util.Optional;

public interface BookService {
    BookDto getByNameV1(String name);

    BookDto getByNameV2(String name);
    BookDto getByNameV3(String name);

    Optional<Object> getBooksByAuthor(Author author);
    List<BookDto>getAllBooks();
}
