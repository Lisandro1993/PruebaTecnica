package mx.com.Examen;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mx.com.Examen.Datos.Empleado;
import mx.com.Examen.Datos.Trabajadas;





@RestController
public class ServicioRest {

	@Autowired
	EmployeesRepository repo;
	
	@Autowired
	JobsRepository rep;
	
	
	@PostMapping("/Empleado")
	public Empleado nuevo(@RequestBody Empleado e) {
		return repo.save(e);
	}
	
	@PostMapping("/Empleado")
	public Trabajadas horas(@RequestBody Trabajadas t) {
		return rep.save(t);
	}
	
	@GetMapping("/Empleado/{job_id}")
	Optional<Empleado> recuperar(@PathVariable Long id){
		return repo.findById(id);
	}
	
	@GetMapping("/Empleado/{horas}")
	Optional<Empleado> consulhoras(@PathVariable Long horas){
		return repo.findById(horas);
	}
	
	@GetMapping("/Empleado/{pago}")
	Optional<Empleado> consulpago(@PathVariable Long pago){
		return repo.findById(pago);
	}
	
}
