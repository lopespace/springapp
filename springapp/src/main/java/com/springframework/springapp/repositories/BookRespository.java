package com.springframework.springapp.repositories;

import com.springframework.springapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRespository extends CrudRepository<Book, Long> {
}
