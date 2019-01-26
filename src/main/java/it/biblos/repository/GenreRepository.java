package it.biblos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.biblos.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>
{
	public Genre findByTipo(String tipo);
}