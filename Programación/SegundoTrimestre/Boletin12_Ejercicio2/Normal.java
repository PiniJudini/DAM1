package Boletin12_Ejercicio2;

import java.time.LocalDate;

class Normal extends Nota {
	public Normal(String titulo, String descripcion, String color, LocalDate fecha) {
		super(titulo,descripcion,color,fecha);
		color = color.toLowerCase();
		if(color.equals("rojo"))
			System.out.println("Las normales no son rojas");
		else
			notas.add(this);
	}
}
