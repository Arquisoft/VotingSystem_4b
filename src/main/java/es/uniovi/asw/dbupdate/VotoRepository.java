package es.uniovi.asw.dbupdate;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import es.uniovi.asw.dbupdate.modelo.Voto;

public interface VotoRepository extends CrudRepository<Voto, Long> {
	List<Voto> findAll();
}
