package it.biblos.facade;

import java.util.List;

import it.biblos.model.Author;
import it.biblos.model.Book;
import it.biblos.model.Map;
import it.biblos.service.BookService;

public class BookFacade
{

	public static List<Book> findAll(BookService bService)
	{
		return bService.findAll();
	}

	public static void save(BookService bService, Book book)
	{
		bService.save(book);
	}

	public static Book findByTitolo(BookService bService, String titolo)
	{
		return bService.findByTitolo(titolo);
	}

	public static Book findByIsbn(BookService bService, String isbn)
	{
		return bService.findByIsbn(isbn);
	}

	public static List<Book> findAllByGenre_Tipo(BookService bService, String tipo)
	{
		return bService.findAllByGenre_Tipo(tipo);
	}

	public static List<Book> findAllByAuthor(BookService bService, Author a)
	{
		return bService.findAllByAuthor(a);
	}

	public static List<Book> findAllByAuthor_Nome(BookService bService, String nome)
	{
		return bService.findAllByAuthor_Nome(nome);
	}

	public static List<Book> findAllByAuthor_Cognome(BookService bService, String cognome)
	{
		return bService.findAllByAuthor_Cognome(cognome);
	}

	public static List<Book> findAllByPositions(BookService bService, List<Map> m)
	{
		return bService.findAllByPositions(m);
	}

	public static Book getOne(BookService bService, Long id)
	{
		return bService.getOne(id);
	}

	public static void saveAndFlush(BookService bService, Book toUpdate)
	{
		bService.saveAndFlush(toUpdate);
	}

	public static void deleteById(BookService bService, Long id)
	{
		bService.deleteById(id);
	}

}
