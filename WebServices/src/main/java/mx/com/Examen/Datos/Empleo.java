package mx.com.Examen.Datos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

@Entity
@SequenceGenerator(name = "producto_Sequence", sequenceName = "JOBS_SEQ")
public class Empleo {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "sequences")
	@TableGenerator( name = "sequences", valueColumnName = "JOBS_seq")
int id;
	@Column(name = "NAME")
String nombre;
	@Column(name = "SALARY")
Double salario;
public Empleo() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Double getSalario() {
	return salario;
}
public void setSalario(Double salario) {
	this.salario = salario;
}


}
