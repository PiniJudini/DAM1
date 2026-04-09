package Examen5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Personaje implements Serializable{
	private String anime;
	private String nombre;
	
	private static ArrayList<Personaje> personajes = new ArrayList<Personaje>();

	public Personaje(String a, String n) {
		this.nombre = n;
		this.anime = a;
		personajes.add(this);
	}
	
	public static void escribirFicheroBinario(String fichero) {
		try (ObjectOutputStream binario = new ObjectOutputStream(new FileOutputStream(fichero))) {
			binario.writeObject(personajes);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void leerFicheroBinario(String fichero) {
		ArrayList<Personaje> listaG = new ArrayList<>();
		try (ObjectInputStream binario = new ObjectInputStream(new FileInputStream(fichero))) {
			listaG = (ArrayList<Personaje>) binario.readObject();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for(Personaje p: listaG)
			System.out.println(p.nombre + " (" + p.anime + ")");
	}
}
