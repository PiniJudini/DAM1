package Boletin25_Ejercicio2;

public class Main {
	public static void main(String[] args) {
		Sucursal s1 = new Sucursal("Calle Alfonso Quintero 3", "Valladolid", 33);
		Cliente andres = new Cliente("Andrés", "Ortega Cebriá", "84938493R", 983290284, s1);
		Cuenta c1 = new Cuenta("123456789012", 3333.33, andres, s1);
		Cuenta c2 = new Cuenta("987654321098", 1289.45, andres, s1);
		
		andres.listarCuentas();
		andres.escribirFichero("cuentas.txt");
		
	}
}
