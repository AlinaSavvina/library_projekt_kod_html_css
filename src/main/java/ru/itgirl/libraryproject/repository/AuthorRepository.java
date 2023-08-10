package ru.itgirl.libraryproject.repository;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import ru.itgirl.libraryproject.model.Author;
import ru.itgirl.libraryproject.model.Book;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long>, JpaSpecificationExecutor<Author> {
        Optional<Author> findAuthorByName(String name);
        @Query(nativeQuery = true, value = "SELECT * FROM Author WHERE name = ?")
        //Optional<Book> findAuthorByNameBySql(String name);
        @Override
        Optional<Author> findOne(Specification<Author> spec);
}




