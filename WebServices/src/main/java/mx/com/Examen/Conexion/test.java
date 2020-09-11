package mx.com.Examen.Conexion;

public class test {
public static void main (String[] args) {
	
	Conex();
}
	public static void Conex() {
		Conexion con=new Conexion();
			if(con.getConnection()!=null) {
				System.out.println("si");
		}
			else {
				System.out.println("No");
			}
	}
}

