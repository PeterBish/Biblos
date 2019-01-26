package it.biblos.serviceint;

import java.util.List;

import it.biblos.model.Author;

public interface AuthorServiceInt 
{
	public List<Author> findAll();
	
	public Author findByNome(String nome);
	
	public Author findByCognome(String cognome);
	
	public void save(Author toAdd);
	
	public void update(Long id, Author toUpdate);
	
	public void delete(Long ID);
}
