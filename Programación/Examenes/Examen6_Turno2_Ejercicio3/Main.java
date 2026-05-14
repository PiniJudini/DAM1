package Examen6_Turno2_Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Carta c = new Carta("Black Lotus", "Artefacto", 0, "Hola mundo");
		Carta c2 = new Carta("White Lotus", "Artefacto", 45, "Cruel Mundo");
		Carta c3 = new Carta("Golden Lotus", "Hechizo", 34, "Mundo Cruel Hola");
		
		ArrayList<Carta> cartas = new ArrayList<>(List.of(c, c2, c3));
		Collections.sort(cartas);
		
		System.out.println(cartas);
		
		System.out.println(c.getUbicacion());
		c.mano();
		System.out.println(c.getUbicacion());
		c2.cementerio();
		System.out.println(c2.getUbicacion());
	}
}
