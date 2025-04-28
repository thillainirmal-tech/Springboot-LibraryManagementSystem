package com.example.library.service;

import com.example.library.model.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final JdbcTemplate jdbcTemplate;

    public BookService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getAllBooks() {
        return jdbcTemplate.query("SELECT * FROM book", new BeanPropertyRowMapper<>(Book.class));
    }

    public Optional<Book> getBookById(Long id) {
        List<Book> books = jdbcTemplate.query("SELECT * FROM book WHERE id = ?", new BeanPropertyRowMapper<>(Book.class), id);
        return books.stream().findFirst();
    }

    public Book addBook(Book book) {
        jdbcTemplate.update("INSERT INTO book (title, author, available) VALUES (?, ?, ?)", book.getTitle(), book.getAuthor(), book.isAvailable());
        return book;
    }

    public void deleteBook(Long id) {
        jdbcTemplate.update("DELETE FROM book WHERE id = ?", id);
    }

    public Book updateBook(Long id, Book book) {
        jdbcTemplate.update("UPDATE book SET title = ?, author = ?, available = ? WHERE id = ?", book.getTitle(), book.getAuthor(), book.isAvailable(), id);
        book.setId(id);
        return book;
    }
}
