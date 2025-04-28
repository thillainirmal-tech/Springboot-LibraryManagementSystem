package com.example.library;

import com.example.library.model.Book;
import com.example.library.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    // This method will be called to initialize the database with sample books
    @Bean
    CommandLineRunner initDatabase(BookService service) {
        return args -> {
            // Adding initial sample data to the book database
            service.addBook(new Book("Introduction to Algorithms", "Thomas H. Cormen"));
            service.addBook(new Book("Clean Code", "Robert C. Martin"));
            service.addBook(new Book("Design Patterns", "Erich Gamma"));
            service.addBook(new Book("Operating System Concepts", "Abraham Silberschatz"));
            service.addBook(new Book("Database System Concepts", "Henry F. Korth"));
            service.addBook(new Book("Artificial Intelligence: A Modern Approach", "Stuart Russell"));
            service.addBook(new Book("Computer Networks", "Andrew S. Tanenbaum"));
            service.addBook(new Book("Modern Operating Systems", "Andrew S. Tanenbaum"));
            service.addBook(new Book("The Pragmatic Programmer", "Andrew Hunt"));
            service.addBook(new Book("Structure and Interpretation of Computer Programs", "Harold Abelson"));
            service.addBook(new Book("Compilers: Principles, Techniques, and Tools", "Alfred V. Aho"));
            service.addBook(new Book("Computer Architecture", "John L. Hennessy"));
            service.addBook(new Book("Introduction to the Theory of Computation", "Michael Sipser"));
            service.addBook(new Book("The Art of Computer Programming", "Donald E. Knuth"));
            service.addBook(new Book("Java: The Complete Reference", "Herbert Schildt"));
            service.addBook(new Book("Effective Java", "Joshua Bloch"));
            service.addBook(new Book("Python Crash Course", "Eric Matthes"));
            service.addBook(new Book("You Don't Know JS", "Kyle Simpson"));
            service.addBook(new Book("Head First Design Patterns", "Eric Freeman"));
            service.addBook(new Book("Code: The Hidden Language of Computer Hardware and Software", "Charles Petzold"));
        };
    }
}
