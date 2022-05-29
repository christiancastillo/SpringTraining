package com.example.demo.repository;

import com.example.demo.model.BookModel;

public interface BookRepository {
	BookModel findByTitle(String title);
	void delete (String title);
	BookModel save(BookModel bookModel);
}
