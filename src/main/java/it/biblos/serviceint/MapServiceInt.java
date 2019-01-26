package it.biblos.serviceint;

import java.util.List;

import it.biblos.model.Map;

public interface MapServiceInt 
{
	public List<Map> findAll();
	
	public List<Map> findAllByCorridoio(String corridoio);
	
	public List<Map> findAllByArmadio(String armadio);

	public List<Map> findAllByPiano(String piano);

	public void save(Map toAdd);
	
	public void update(Long id, Map toUpdate);
	
	public void delete(Long id);
}
