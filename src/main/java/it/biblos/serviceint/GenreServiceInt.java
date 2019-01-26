package it.biblos.serviceint;

import java.util.List;

import it.biblos.model.Genre;

public interface GenreServiceInt
{
	public List<Genre> findAll();
	
	public Genre findByTipo(String nome);
	
	public void save(Genre toAdd);
	
	public void update(Long id, Genre toUpdate);
	
	public void delete(Long ID);
}
