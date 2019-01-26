package it.biblos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.biblos.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>
{
	public Author findByNome(String nome);
	
	public Author findByCognome(String cognome);
}