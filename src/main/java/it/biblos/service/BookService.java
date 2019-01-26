package it.biblos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.biblos.model.*;
import it.biblos.repository.BookRepository;
import it.biblos.serviceint.BookServiceInt;

@Service
public class BookService implements BookServiceInt
{

	@Autowired
	private BookRepository bookRepo; 
	
	public List<Book> findAll()
	{
		return bookRepo.findAll();
	}

	@Override
	public void save(Book book)
	{
		bookRepo.save(book);
	}

	@Override
	public Book findByTitolo(String titolo)
	{
		return bookRepo.findByTitolo(titolo);
	}

	@Override
	public Book findByIsbn(String isbn)
	{
		return bookRepo.findByIsbn(isbn);
	}

	@Override
	public List<Book> findAllByGenre_Tipo(String tipo)
	{
		return bookRepo.findAllByGenre_Tipo(tipo);
	}

	@Override
	public List<Book> findAllByAuthor(Author a)
	{
		return bookRepo.findAllByAuthor(a);
	}

	@Override
	public List<Book> findAllByAuthor_Nome(String nome)
	{
		return bookRepo.findAllByAuthor_Nome(nome);
	}

	@Override
	public List<Book> findAllByAuthor_Cognome(String cognome)
	{
		return bookRepo.findAllByAuthor_Cognome(cognome);
	}

	@Override
	public List<Book> findAllByPositions(List<Map> m)
	{
		return bookRepo.findAllByPositions(m);
	}

	@Override
	public void update(Long id, Book updated)
	{
		Book toUpdate = bookRepo.getOne(id);
		toUpdate.setTitolo(updated.getTitolo());
		toUpdate.setAuthor(updated.getBookAutore());
		toUpdate.setGenre(updated.getBookGenre());
		toUpdate.setIsbn(updated.getIsbn());
		toUpdate.setPositions(updated.getPositions());
		bookRepo.saveAndFlush(toUpdate);
	}

	@Override
	public void delete(Long id)
	{
		bookRepo.deleteById(id);
	}

	public Book getOne(Long id)
	{
		return bookRepo.getOne(id);
	}

	public void saveAndFlush(Book toUpdate)
	{
		bookRepo.saveAndFlush(toUpdate);
	}

	public void deleteById(Long id)
	{
		bookRepo.deleteById(id);
	}

}