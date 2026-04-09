package Examen5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Ejercicio1 {
	public static void main(String[] args) {
		String entrada1 = "/home/alumno/personajes.txt";
		String entrada2 = "/home/alumno/animes.txt";

		ArrayList<String> personajes = leerFichero(entrada1);
		ArrayList<String> animes = leerFichero(entrada2);

		HashMap<Integer, String> diccionario = obtenerDiccionarioAnimes(animes);

		HashMap<String, String> diccionario2 = new HashMap<String, String>();

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
		
		ArrayList<String> animesSinPersonajes = encontrarAnimesSinPersonajes(diccionario, diccionario2);
		
		HashSet<String> anim = new HashSet<String>();
		for (String nombre : diccionario.values())
			anim.add(nombre);

		ArrayList<String> terminado = new ArrayList<String>(anim);
		
		for (String nombre : terminado) {
			System.out.println(nombre);
			if(animesSinPersonajes.contains(nombre))
				System.out.println("- No hay personajes");

			Iterator<Map.Entry<String, String>> iterador = diccionario2.entrySet().iterator();
			while (iterador.hasNext() == true) {
				Map.Entry<String, String> personaje = iterador.next();
				if (personaje.getValue().equals(nombre)) {
					System.out.println("- " + personaje.getKey());
				}
			}
			System.out.println();
		}

		if (personas.size() != 0) {
			System.out.println("Personajes sin anime");
			for (String p : personas)
				System.out.println("- " + p);
		}

	}

	public static ArrayList<String> leerFichero(String fichero) {
		ArrayList<String> lineas = new ArrayList<>();
		try {
			Path archivo = Path.of(fichero);
			lineas = (ArrayList<String>) Files.readAllLines(archivo);
		} catch (Exception e) {
			System.out.println("Error con el fichero");
			System.out.println(e.getMessage());
		}

		return lineas;
	}
	
	public static ArrayList<String> encontrarAnimesSinPersonajes(HashMap<Integer, String> diccionario, HashMap<String, String> diccionario2) {
		ArrayList<String> animes2 = new ArrayList<>();
		
		Iterator<Map.Entry<Integer, String>> iterador1 = diccionario.entrySet().iterator();
		while (iterador1.hasNext() == true) {
			Map.Entry<Integer, String> anime = iterador1.next();
			if (diccionario2.containsValue(anime.getValue()) == false) {
				animes2.add(anime.getValue());
			}
		}
		
		return animes2;
	}
	
	public static HashMap<Integer, String> obtenerDiccionarioAnimes(ArrayList<String> animes) {
		HashMap<Integer, String> diccionario = new HashMap<>();
		for (String linea : animes) {
			String[] array = linea.split(" ");
			int id = Integer.parseInt(array[0]);

			String nombre = "";
			if (array.length == 2)
				nombre = array[1];
			else if (array.length == 3)
				nombre = array[1] + " " + array[2];
			else
				nombre = array[1] + " " + array[2] + " " + array[3];

			diccionario.put(id, nombre);
		}
		
		return diccionario;
	}
}
