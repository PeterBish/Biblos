package it.biblos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.biblos.model.Author;
import it.biblos.model.Book;
import it.biblos.model.Map;
import it.biblos.service.BookService;

@RestController
@RequestMapping("/books")
public class BooksController
{
	@Autowired
	private BookService bookServiceImpl;

	@GetMapping("/all")
	public List<Book> findAll()
	{
		return bookServiceImpl.findAll();
	}

	@GetMapping("/title={titolo}")
	public Book findByTitolo(@PathVariable String titolo)
	{
		return bookServiceImpl.findByTitolo(titolo);
	}

	@GetMapping("/isbn={isbn}")
	public Book findByIsbn(@PathVariable String isbn)
	{
		return bookServiceImpl.findByIsbn(isbn);
	}

	@GetMapping("/genre={genre}")
	public List<Book> findAllByGenre_Tipo(@PathVariable String tipo)
	{
		return bookServiceImpl.findAllByGenre_Tipo(tipo);
	}

	@GetMapping("/author={author}")
	public List<Book> findAllByAuthor(@RequestBody Author a)
	{
		return bookServiceImpl.findAllByAuthor(a);
	}

	@GetMapping("/author/name={nome}")
	public List<Book> findAllByAuthor_Nome(@PathVariable String nome)
	{
		return bookServiceImpl.findAllByAuthor_Nome(nome);
	}

	@GetMapping("/author/cognome={cognome}")
	public List<Book> findAllByAuthor_Cognome(@PathVariable String cognome)
	{
		return bookServiceImpl.findAllByAuthor_Cognome(cognome);
	}

	@GetMapping("/map")
	public List<Book> findAllByPositions(@RequestBody List<Map> positions)
	{
		return bookServiceImpl.findAllByPositions(positions);
	}

	@PostMapping("/ins")
	public void addBook(@RequestBody Book book)
	{
		bookServiceImpl.save(book);
	}
	
	@PutMapping("/up/id={id}")
	public void update(@PathVariable Long id, @RequestBody Book updated)
	{
		bookServiceImpl.update(id, updated);
	}

	@DeleteMapping("/canc/id={id}")
	public void delete(Long id)
	{
		bookServiceImpl.delete(id);
	}
}