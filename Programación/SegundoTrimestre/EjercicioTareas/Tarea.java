package EjercicioTareas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Tarea {
	private String titulo;
	private String descripcion;
	private String color;
	private LocalDate fecha;
	private boolean completada;
	
	private static ArrayList<Tarea> lista = new ArrayList<>();
	
	public Tarea(String t, String d, String c) {
		this.titulo = t;
		this.descripcion = d;
		this.color = c;
		this.fecha = LocalDate.now();
		lista.add(this);
	}
	
	public void setCompletado() {
		this.completada = true;
	}
	
	public void mostrar() {
		System.out.println(this.titulo + " (" + this.color + ")");
		System.out.println(this.descripcion);
		System.out.println("Fecha: " + this.fecha + " - " + "Completada: " + this.completada);
	}
	
	public static void mostrarTareas() {
		for(int i=0; i<lista.size(); i++) {
			lista.get(i).mostrar();
		}
	}
	
	public static void mostrarTareasnoCompletadas() {
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).completada != true)
				lista.get(i).mostrar();
		}
	}
	
	public void eliminarTarea() {
		if(lista.remove(this) == false)
			System.err.println("No puedo eliminar la tarea, no existe");
	}
}
