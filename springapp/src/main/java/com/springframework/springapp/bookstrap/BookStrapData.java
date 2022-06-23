package com.springframework.springapp.bookstrap;

import com.springframework.springapp.domain.Author;
import com.springframework.springapp.domain.Book;
import com.springframework.springapp.repositories.AuthorRespoitory;
import com.springframework.springapp.repositories.BookRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookStrapData implements CommandLineRunner {

    private final AuthorRespoitory authorRespoitory;
    private final BookRespository bookRespository;

    public BookStrapData(AuthorRespoitory authorRespoitory, BookRespository bookRespository) {
        this.authorRespoitory = authorRespoitory;
        this.bookRespository = bookRespository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("domain driven design", "111111");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRespoitory.save(eric);
        bookRespository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noejb = new Book("j2ee develop without ejb", "112233");
        rod.getBooks().add(noejb);
        noejb.getAuthors().add(rod);

        authorRespoitory.save(rod);
        bookRespository.save(noejb);
        System.out.println("start in boostrap");
        System.out.println("Number of books : " + bookRespository.count());
    }
}
