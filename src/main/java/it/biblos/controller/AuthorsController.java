package it.biblos.controller;

import java.util.List;

import it.biblos.model.Author;
import it.biblos.service.AuthorService;
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
@RequestMapping("/authors")
public class AuthorsController {

	@Autowired
	private AuthorService authorServiceImpl;
	
	@GetMapping("/all")
	public List<Author> findAll()
	{
		return authorServiceImpl.findAll();
	}
	
	@GetMapping("/name={nome}")
	public Author getAuthorByNome(@PathVariable String nome)
	{
		return authorServiceImpl.findByNome(nome);
	}
	
	@GetMapping("/surname={cognome}")
	public Author getAuthorByCognome(@PathVariable String cognome)
	{
		return authorServiceImpl.findByCognome(cognome);
	}

	@PostMapping("/ins")
	public void addAuthor(@RequestBody Author toAdd)
	{
		authorServiceImpl.save(toAdd);
	}
	
	@PutMapping("/up/id={id}")
	public void updateAuthor(@PathVariable Long id, @RequestBody Author toUpdate)
	{
		authorServiceImpl.update(id, toUpdate);
	}
	
	@DeleteMapping("/canc/id={id}")
	public void delete(@PathVariable Long id)
	{
		authorServiceImpl.delete(id);
	}
}
