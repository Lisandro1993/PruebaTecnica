package mx.com.Examen.Datos;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;
@Entity
@SequenceGenerator(name = "producto_Sequence", sequenceName = "EMPLOYEE__WORKED_HOURS_SEQ")
public class Trabajadas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "sequences")
	@TableGenerator( name = "sequences", valueColumnName = "EMPLOYEE__WORKED_HOURS_seq")	
int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEES_ID", nullable = false)	
Empleado id_empleado;
	@Column(name = "WORKED_HOURS")
int horas;
	@Column(name = "WORKED_DATE")
Date worked_date;
public Trabajadas() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Empleado getId_empleado() {
	return id_empleado;
}
public void setId_empleado(Empleado id_empleado) {
	this.id_empleado = id_empleado;
}
public int getHoras() {
	return horas;
}
public void setHoras(int horas) {
	this.horas = horas;
}
public Date getWorked_date() {
	return worked_date;
}
public void setWorked_date(Date worked_date) {
	this.worked_date = worked_date;
}


}
