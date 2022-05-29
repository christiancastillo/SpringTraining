package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.BookModel;
import com.example.demo.repository.BookRepository;

@RestController
public class WebServicesController {
	@Autowired
	BookRepository repository;
	MongoTemplate mongoTemplate;
	
	@RequestMapping(value = "/book", method = RequestMethod.POST)	
	public BookModel saveBook(BookModel bookModel) {
		return repository.save(bookModel);
	}
	
	@RequestMapping(value = "/book/{title}", method = RequestMethod.GET)
	@Cacheable (value = "book", key = "#title") //valores en caché
	public BookModel findBookByTitle(@PathVariable String title) {
		BookModel insertedBook = repository.findByTitle(title);
		return insertedBook;
	}
	
	
	
}
