package Boletin25_Ejercicio1;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String salida = "/home/pinipon/salida.dat";
		String entrada = salida;

		Pokemon pikachu = new Pokemon(333, "Pikachu", "Eléctrico", 10, 20, 30, 40);
		Pokemon charizard = new Pokemon(7, "Charizard", "Fuego", "Volador", 80, 100, 200, 300);
		Pokemon.escribirFichero(salida);
		
		ArrayList<Pokemon> pokemons = Pokemon.leerFichero(entrada);
		Pokemon.listarPokemons();
	}
}