package com.southwind.springboottext.repository;

import com.southwind.springboottext.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}

