package mx.com.Examen;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.Examen.Datos.Empleo;
import mx.com.Examen.Datos.Trabajadas;

@Repository
public interface JobsRepository extends CrudRepository<Trabajadas, Long>{
	Trabajadas findByEmpleado(long Eid);
	
	List<Trabajadas> findByEmpleadoId(Long EmId);
}
