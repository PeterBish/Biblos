package it.biblos.service;

import it.biblos.model.Map;
import it.biblos.repository.MapRepository;
import it.biblos.serviceint.MapServiceInt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapService implements MapServiceInt{

	@Autowired
	private MapRepository mapRepo;

	@Override
	public List<Map> findAll()
	{
		return mapRepo.findAll();
	}

	@Override
	public List<Map> findAllByCorridoio(String corridoio)
	{
		return mapRepo.findAllByCorridoio(corridoio);
	}

	@Override
	public List<Map> findAllByArmadio(String armadio)
	{
		return mapRepo.findAllByArmadio(armadio);
	}

	@Override
	public List<Map> findAllByPiano(String piano)
	{
		return mapRepo.findAllByPiano(piano);
	}

	@Override
	public void save(Map toAdd)
	{
		mapRepo.saveAndFlush(toAdd);
	}

	@Override
	public void update(Long id, Map updated)
	{
		Map map = mapRepo.findById(id).get();
		map.setCorridoio(updated.getCorridoio());
		map.setArmadio(updated.getArmadio());
		map.setPiano(updated.getPiano());
		mapRepo.saveAndFlush(map);	
	}

	@Override
	public void delete(Long id)
	{
		mapRepo.deleteById(id);
	}

}
