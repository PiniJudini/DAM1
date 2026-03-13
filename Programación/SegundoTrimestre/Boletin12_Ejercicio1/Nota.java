package Boletin12_Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Nota {
	private String titulo;
	private String descripcion;
	private String color;
	private LocalDate fecha;
	private static ArrayList<Nota> notas = new ArrayList<>();
	
	public Nota(String t, String d, String c, LocalDate fecha) {
		this.titulo = t;
		this.descripcion = d;
		this.color = c;
		this.fecha = fecha;
	}
	
	public static Nota crearNota(String t, String d, String c, LocalDate fecha) {
		Nota nota = new Nota(t,d,c,fecha);
		notas.add(nota);
		return nota;
	}
	
	public void eliminarNota() {
		notas.remove(this);
	}
	
	public void listarNota() {
		System.out.println("---NOTA---");
		System.out.println("Titulo: " + this.titulo + " Descripción: " + this.descripcion);
		System.out.println("Color: " + this.color + " Fecha: " + this.fecha);
	}
	
	public static void listarNotas() {
		for(int i=0; i<notas.size(); i++) {
			notas.get(i).listarNota();
		}
	}
	
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.now();
		Nota nota1 = crearNota("Ejercicio","Ponerme más fuerte que el fackin Llados","Amarillo",fecha);
		Nota nota2 = crearNota("No ser gay","No serlo","Verde",fecha);
		listarNotas();
		nota1.eliminarNota();
		listarNotas();
	}
}
