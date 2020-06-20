package com.khasimvali.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khasimvali.onlinebookstore.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
