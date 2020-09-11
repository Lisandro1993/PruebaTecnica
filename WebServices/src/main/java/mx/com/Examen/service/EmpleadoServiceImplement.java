package mx.com.Examen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.Examen.EmployeesRepository;
import mx.com.Examen.JobsRepository;
import mx.com.Examen.Datos.Empleado;
import mx.com.Examen.Datos.Empleo;
import mx.com.Examen.Datos.Trabajadas;





@Service
public class EmpleadoServiceImplement implements EmpleadoService {
	@Autowired
	private EmployeesRepository er;
	
	@Autowired
	private JobsRepository jr;
	
	@Override
	public List<String> getAllEmploJob(long EId) {
		List<String> result = new ArrayList<String>();
		List<Empleado> empleo = er.findByEmpleoId(EId);
		for (Empleado emple : empleo) {
			result.add(emple.getName());
		}
		return result;
	}

	@Override
	public void addEmpleEmpleoGene(Trabajadas e, Long EId, Long GId) {
		System.out.println(e);
		Optional<Trabajadas> emple = jr.findById(EId);
		e.setId_empleado(emple.get());
		jr.save(e);

	}

	@Override
	public List<Trabajadas> getTrabajadas() {
		List<Trabajadas> em = (List<Trabajadas>) jr.findAll();
		return em;
	}

}
