package it.biblos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.biblos.model.Genre;
import it.biblos.repository.GenreRepository;
import it.biblos.serviceint.GenreServiceInt;

@Service
public class GenreService implements GenreServiceInt{

	@Autowired
	private GenreRepository genreRepo;
	
	public List<Genre> findAll()
	{
		return genreRepo.findAll();
	}

	public Genre findByTipo(String tipo)
	{
		return genreRepo.findByTipo(tipo);
	}

	@Override
	public void save(Genre toAdd)
	{
		genreRepo.saveAndFlush(toAdd);
	}

	@Override
	public void update(Long id, Genre updated)
	{
		Genre toUpdate = genreRepo.findById(id).get();
		toUpdate.setTipo(updated.getTipo());
		genreRepo.saveAndFlush(toUpdate);
	}

	@Override
	public void delete(Long id)
	{
		genreRepo.deleteById(id);
	}
}