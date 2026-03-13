package Boletin12_Ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Nota {
	protected String titulo;
	protected String descripcion;
	protected String color;
	protected LocalDate fecha;
	protected static ArrayList<Nota> notas = new ArrayList<>();
	
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
		String colorcillo = this.color.toLowerCase();
		if(colorcillo.equals("rojo")) {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Estás seguro de que quieres eliminar la tarea?: ");
			String entrada = teclado.nextLine();
			
			if(entrada.equals("si"))
				notas.remove(this);
			else if(entrada.equals("no"))
				System.out.println("Bien reculado");
			else
				System.out.println("Entrada incorrecta");
				
		}
		else 
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
}
