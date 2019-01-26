package it.biblos.controller;

import it.biblos.model.Map;
import it.biblos.service.MapService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maps")
public class MapsController {

	@Autowired
	private MapService MapServiceImpl;
	
	@GetMapping("/all")
	public List<Map> findAll()
	{
		return MapServiceImpl.findAll();
	}
	
	@GetMapping("/corridoio={corridoio}")
	public List<Map> getMapByCorridoio(@PathVariable String corridoio)
	{
		return MapServiceImpl.findAllByCorridoio(corridoio);
	}
	
	@GetMapping("/armadio={armadio}")
	public List<Map> getMapByArmadio(@PathVariable String armadio)
	{
		return MapServiceImpl.findAllByArmadio(armadio);
	}

	@GetMapping("/piano={piano}")
	public List<Map> getMapByPiano(@PathVariable String piano)
	{
		return MapServiceImpl.findAllByPiano(piano);
	}

	@PostMapping("/ins")
	public void addMap(@RequestBody Map toAdd)
	{
		MapServiceImpl.save(toAdd);
	}
	
	@PutMapping("/up/id={id}")
	public void updateMap(@PathVariable Long id, @RequestBody Map toUpdate)
	{
		MapServiceImpl.update(id, toUpdate);
	}
	
	@DeleteMapping("/canc/id={id}")
	public void delete(@PathVariable Long id)
	{
		MapServiceImpl.delete(id);
	}
}