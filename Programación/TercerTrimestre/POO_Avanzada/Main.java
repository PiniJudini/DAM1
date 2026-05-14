package POO_Avanzada;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("Bulbasaur", 12, "Planta");
		Pokemon p2 = new Pokemon("Charizard", 1, "Fuego", "Volador");
		Pokemon p3 = new Pokemon("Venasaur", 3, "Planta");
		Pokemon p4 = new Pokemon("Pikachu", 25, "Eléctrico");
		Pokemon p5 = new Pokemon("Newtho", 5, "Oscuro");
		Pokemon pikachu = p4;
		Pokemon pikachu2 = new Pokemon("Pikachu", 25, "Eléctrico");

		System.out.println(p2);

		// De normal, el equals trabaja con el código que pone la clase Objeto a cada
		// Pokemon.
		// ↓ Por eso en este caso funciona ↓
		if (p4.equals(pikachu))
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");

		// ↓ Y en este no ↓
		if (p4.equals(pikachu2))
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");

		ArrayList<Pokemon> pokes = new ArrayList<Pokemon>(List.of(p1, p2, p3, p4, p5, pikachu, pikachu2));

		// El .sort() utiliza el método compareTo. Al modificarlo en la clase Pokemon,
		// le hemos puesto la condición de ordenación que
		// hemos querido (compara los códigos).
		Collections.sort(pokes);
		System.out.println(pokes);
	}
}
