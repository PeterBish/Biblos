package it.biblos.repository;

import it.biblos.model.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>
{
	public Book findByTitolo(String titolo);

	public Book findByIsbn(String isbn);

	public List<Book> findAllByGenre_Tipo(String tipo);

	public List<Book> findAllByAuthor(Author a);
	
	public List<Book> findAllByAuthor_Nome(String nome);
	
	public List<Book> findAllByAuthor_Cognome(String cognome);

	public List<Book> findAllByPositions(List<Map> positions);
	
}
