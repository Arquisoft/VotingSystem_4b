package es.uniovi.asw.db;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import es.uniovi.asw.modelo.ColegioElectoral;

public interface ColegioRepository extends JpaRepository<ColegioElectoral, Long> {
	ColegioElectoral findByCodigoColegio(int codigoColegio);
	List<ColegioElectoral> findAll();
}
