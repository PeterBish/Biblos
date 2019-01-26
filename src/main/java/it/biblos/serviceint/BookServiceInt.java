package it.biblos.serviceint;

import java.util.List;

import it.biblos.model.*;

public interface BookServiceInt {

	public void save(Book book);
	
	public Book findByTitolo(String titolo);

	public Book findByIsbn(String isbn);

	public List<Book> findAllByGenre_Tipo(String tipo);

	public List<Book> findAllByAuthor(Author a);
	
	public List<Book> findAllByAuthor_Nome(String nome);
	
	public List<Book> findAllByAuthor_Cognome(String cognome);

	public List<Book> findAllByPositions(List<Map> positons);

	public void update(Long id, Book book);

	public void delete(Long id);
}
