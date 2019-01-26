package it.biblos.controller;

import java.util.List;

import it.biblos.model.Genre;
import it.biblos.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Field in required a bean of type ServiceImpl' that could not be found
@RestController
@RequestMapping("/genres")
public class GenresController {

	@Autowired
	private GenreService genreServiceImpl;
	
	@GetMapping("/all")
	public List<Genre> findAll()
	{
		return genreServiceImpl.findAll();
	}
	
	@GetMapping("/tipo={tipo}")
	public Genre getGenreByTipo(@PathVariable String tipo)
	{
		return genreServiceImpl.findByTipo(tipo);
	}
	
	@PostMapping("/ins")
	public void addGenre(@RequestBody Genre toAdd)
	{
		genreServiceImpl.save(toAdd);
	}
	
	@PutMapping("/up/id={id}")
	public void updateGenre(@PathVariable Long id, @RequestBody Genre toUpdate)
	{
		genreServiceImpl.update(id, toUpdate);
	}
	
	@DeleteMapping("/canc/id={id}")
	public void delete(@PathVariable Long id)
	{
		genreServiceImpl.delete(id);
	}
}
