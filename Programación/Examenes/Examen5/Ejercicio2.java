package Examen5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		String entrada1 = "/home/alumno/personajes.txt";
		String entrada2 = "/home/alumno/animes.txt";

		ArrayList<String> personajes = Ejercicio1.leerFichero(entrada1);
		ArrayList<String> animes = Ejercicio1.leerFichero(entrada2);
		
		HashMap<String, String> diccionario2 = new HashMap<String, String>();
		HashMap<Integer, String> diccionario = Ejercicio1.obtenerDiccionarioAnimes(animes);
		
		ArrayList<String> personas = new ArrayList<String>();
		for (String linea : personajes) {
			String[] array = linea.split(" ");
			int id = Integer.parseInt(array[0]);
			String nombre = array[1] + " " + array[2];

			if (diccionario.get(id) != null)
				diccionario2.put(nombre, diccionario.get(id));
			else
				personas.add(nombre);
		}
		
		for (String p : personas) {
			Iterator<Map.Entry<String, String>> iterador = diccionario2.entrySet().iterator();
			while (iterador.hasNext() == true) {
				Map.Entry<String, String> personaje = iterador.next();
				if (personaje.getKey().equals(p) == false) {
					Personaje personajillo = new Personaje(personaje.getValue(), personaje.getKey());
				}
			}
		}

		String fichero = "/home/alumno/personajes.dat";
		Personaje.escribirFicheroBinario(fichero);
		Personaje.leerFicheroBinario(fichero);
	}
}
