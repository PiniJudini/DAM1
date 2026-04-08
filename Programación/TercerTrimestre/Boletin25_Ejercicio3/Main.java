package Boletin25_Ejercicio3;

public class Main {
	public static void main(String[] args) {
		Conductor andres = new Conductor("Andrés Ortega Cebriá", "89833884T", 2005, 2025, 8);
		Coche nissan = new Coche("ESP 033", 2023, andres);
		
		nissan.mostrarPrecioSeguro();
	}
}
