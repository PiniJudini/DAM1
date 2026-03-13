package Boletin12_Ejercicio2;

import java.time.LocalDate;

class Urgente extends Nota {
	public Urgente(String titulo, String descripcion, String color, LocalDate fecha) {
		super(titulo,descripcion,color,fecha);
		
		color = color.toLowerCase();
		if(color.equals("rojo")==false)
			System.out.println("Las urgentes son siempre rojas");
		else
			notas.add(this);
	}
}
