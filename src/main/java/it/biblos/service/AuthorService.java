package it.biblos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.biblos.model.Author;
import it.biblos.repository.AuthorRepository;
import it.biblos.serviceint.AuthorServiceInt;

@Service
public class AuthorService implements AuthorServiceInt{

	@Autowired
	private AuthorRepository authorRepo;

	public List<Author> findAll()
	{
		return authorRepo.findAll();
	}

	public Author findByNome(String nome)
	{
		return authorRepo.findByNome(nome);
	}
	
	public Author findByCognome(String cognome)
	{
		return authorRepo.findByCognome(cognome);
	}

	@Override
	public void save(Author toAdd)
	{
		authorRepo.saveAndFlush(toAdd);
	}

	@Override
	public void update(Long id, Author updated)
	{
		Author a = authorRepo.findById(id).get();
		a.setNome(updated.getNome());
		a.setCognome(updated.getCognome());
		authorRepo.saveAndFlush(a);	
	}

	@Override
	public void delete(Long id)
	{
		authorRepo.deleteById(id);
		authorRepo.flush();
	}
}