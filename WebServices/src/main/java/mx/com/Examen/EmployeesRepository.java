package mx.com.Examen;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.Examen.Datos.Empleado;

@Repository
public interface EmployeesRepository extends CrudRepository<Empleado, Long> {
List<Empleado> findByNameContaining(String name);

List<Empleado> findByEmpleoId(long EId);

}
