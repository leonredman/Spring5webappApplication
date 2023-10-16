package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

// configured Book Repositories for Book entity and Author entity

public interface BookRepository extends CrudRepository<Book, Long> {
}
