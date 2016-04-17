package es.uniovi.asw.dbupdate;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.dbupdate.modelo.Partido;

public interface PartidoRepository extends CrudRepository<Partido, Long> {
	
	Partido findBySigla(String sigla);
	List<Partido> findAll();
}
