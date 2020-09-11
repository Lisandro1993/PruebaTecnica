package mx.com.Examen.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
private Connection con = null;
//private String url="jdbc:oracle:thin:@(DESCRIPTION=(LOAD_BALANCE=on)(ADDRESS=(PROTOCOL=TCP)(HOST=soportetest.c6digbpdnlhw.us-east-1.rds.amazonaws.com) (PORT=1521))(CONNECT_DATA=(SID=XE))(Service_Name=ZEUSTEST))";
private String url ="jdbc:oracle:thin:@//soportetest.c6digbpdnlhw.us-east-1.rds.amazonaws.com:1521/ZEUSTEST" ;
//private String Service_Name="ZEUSTEST";
private String user="ZEUS";
private String pass="Z3uSp4ss2019@";



public Conexion() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, user, pass);
	} catch (Exception e) {
		System.out.println(e);
		
	}
}
public Connection getConnection() {
	return con;
}


}
