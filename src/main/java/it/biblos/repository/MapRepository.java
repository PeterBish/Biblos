package it.biblos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.biblos.model.Map;

public interface MapRepository extends JpaRepository<Map, Long>
{
	public List<Map> findAllByCorridoio(String corridoio);

	public List<Map> findAllByArmadio(String armadio);

	public List<Map> findAllByPiano(String piano);
}