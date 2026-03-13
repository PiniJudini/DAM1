package Boletin12_Ejercicio2;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.now();
		Urgente nota1 = new Urgente("Ejercicio","Más fuerte que Llados","Rojo",fecha);
		Normal nota2 = new Normal("Dieta","Reducir peso","Verde",fecha);
		Nota.listarNotas();
		nota1.eliminarNota();
		Nota.listarNotas();
	}
}
