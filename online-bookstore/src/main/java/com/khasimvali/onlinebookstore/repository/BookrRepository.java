package com.khasimvali.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khasimvali.onlinebookstore.model.Book;

public interface BookrRepository extends JpaRepository<Book, Long>{

}
