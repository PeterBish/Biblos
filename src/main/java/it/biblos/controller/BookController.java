package it.biblos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import it.biblos.service.BookService;

@RestController
public class BookController
{

	@Autowired
	private BookService bService;
	
	public BookController()
	{

	}

}
