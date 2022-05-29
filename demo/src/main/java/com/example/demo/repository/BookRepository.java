package com.example.demo.repository;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;

import com.example.demo.model.BookModel;

public interface BookRepository {
	BookModel findByTitle(String title);
	
	@CacheEvict (value = "book", key = "#title")
	void delete (String title);
	@CachePut(value = "book", key = "#title")
	BookModel save(BookModel bookModel);
}
