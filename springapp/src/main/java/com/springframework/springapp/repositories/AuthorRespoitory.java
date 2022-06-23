package com.springframework.springapp.repositories;

import com.springframework.springapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRespoitory extends CrudRepository<Author, Long> {

}
