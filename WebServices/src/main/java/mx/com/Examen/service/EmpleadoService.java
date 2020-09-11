package mx.com.Examen.service;

import java.util.List;

import mx.com.Examen.Datos.Empleado;
import mx.com.Examen.Datos.Empleo;
import mx.com.Examen.Datos.Trabajadas;


public interface EmpleadoService {
	public List<String> getAllEmploJob(long EId);

	public void addEmpleEmpleoGene(Trabajadas e, Long EId, Long GId);

	public List<Trabajadas> getTrabajadas();
}
