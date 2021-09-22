package com.books.bookstore.resolver;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.books.bookstore.model.Author;
import com.books.bookstore.model.Book;
import com.books.bookstore.repository.AuthorRepository;
import com.books.bookstore.repository.BookRepository;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
}
