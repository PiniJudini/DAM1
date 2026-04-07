package Binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String fichero = "/home/alumno/binario.dat";
		escribirFicheroBinario(fichero);
		leerFicheroBinario(fichero);
		Tarea t1 = new Tarea("E34", "Aprender a grabar objetos con Java", 1, 0);
		Tarea t2 = new Tarea("E35", "Jugar Fornait", 8, 0);
		Tarea t3 = new Tarea("E36", "Hacer la comida", 4, 0);
		Tarea t4 = new Tarea("E37", "Jugar Rocket", 5, 0);
		Tarea t5 = new Tarea("E38", "Aprender a hablar", 7, 0);
		ArrayList<Tarea> tareas = new ArrayList<>(List.of(t1,t2,t3,t4,t5));
		grabarLista(tareas, fichero);
	}
	
	public static ArrayList<Tarea> leerLista(ArrayList<Tarea> lista, String fichero) {
		ArrayList<Tarea> listaG = new ArrayList<>();
		try (ObjectInputStream binario = new ObjectInputStream(new FileInputStream(fichero))) {
			listaG = (ArrayList<Tarea>) binario.readObject();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return listaG;
	}
	
	public static void grabarLista(ArrayList<Tarea> lista, String fichero) {
		try (ObjectOutputStream binario = new ObjectOutputStream(new FileOutputStream(fichero))) {
			binario.writeObject(lista);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void grabarTarea(Tarea tarea, String fichero) {
		try (ObjectOutputStream binario = new ObjectOutputStream(new FileOutputStream(fichero))) {
			binario.writeObject(tarea);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static Tarea leerTarea(String fichero) {
		Tarea tarea = null;
		try (ObjectInputStream binario = new ObjectInputStream(new FileInputStream(fichero))) {
			tarea = (Tarea) binario.readObject();
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return tarea;
	}
	
	public static void leerFicheroBinario(String fichero) {
		try (DataInputStream binario = new DataInputStream(new FileInputStream(fichero))) {
			System.out.println(binario.readInt());
			System.out.println(binario.readDouble());
			System.out.println(binario.readBoolean());
			System.out.println(binario.readChar());
			System.out.println(binario.readUTF());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void escribirFicheroBinario(String fichero) {
		try (DataOutputStream binario = new DataOutputStream(new FileOutputStream(fichero))) {
			binario.writeInt(33);
			binario.writeDouble(33.33);
			binario.writeBoolean(false);
			binario.writeChar('X');
			binario.writeUTF("Hola mundo cruel");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
