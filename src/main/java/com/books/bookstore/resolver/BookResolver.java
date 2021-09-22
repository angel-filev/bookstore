package com.books.bookstore.resolver;


import com.books.bookstore.model.Author;
import com.books.bookstore.model.Book;
import com.books.bookstore.repository.AuthorRepository;
import com.coxautodev.graphql.tools.GraphQLResolver;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId()).get();
    }
}