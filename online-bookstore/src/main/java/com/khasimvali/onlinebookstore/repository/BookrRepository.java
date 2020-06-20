package com.khasimvali.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.khasimvali.onlinebookstore.model.Book;

@CrossOrigin("http://localhost:4200")
public interface BookrRepository extends JpaRepository<Book, Long>{

}
