package com.books.bookstore.repository;

import com.books.bookstore.model.Book;
import org.springframework.data.repository.CrudRepository;


/*https://stackoverflow.com/questions/44101061/missing-crudrepositoryfindone-method*/

public interface BookRepository extends CrudRepository<Book, Long> {
}
