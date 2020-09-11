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
@SequenceGenerator(name = "producto_Sequence", sequenceName = "EMPLOYEES_SEQ")
public class Empleado  {
	
@Id
@GeneratedValue(strategy = GenerationType.TABLE, generator = "sequences")
@TableGenerator( name = "sequences", valueColumnName = "EMPLOYEES_seq")
int id;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "GENDER_ID", nullable = false)
genero gender_id;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "JOB_ID", nullable = false)
Empleo job_id;
@Column(name = "NAME")
String name;
@Column(name = "LAST_NAME")
String last_name;
@Column(name = "BIRTHDATE")
Date birtdate;
public Empleado() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public genero getGender_id() {
	return gender_id;
}
public void setGender_id(genero gender_id) {
	this.gender_id = gender_id;
}
public Empleo getJob_id() {
	return job_id;
}
public void setJob_id(Empleo job_id) {
	this.job_id = job_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public Date getBirtdate() {
	return birtdate;
}
public void setBirtdate(Date birtdate) {
	this.birtdate = birtdate;
}


}
