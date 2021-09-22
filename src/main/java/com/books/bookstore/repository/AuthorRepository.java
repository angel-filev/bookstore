package com.books.bookstore.repository;

import com.books.bookstore.model.Author;
import org.springframework.data.repository.CrudRepository;

/*https://stackoverflow.com/questions/44101061/missing-crudrepositoryfindone-method*/

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
