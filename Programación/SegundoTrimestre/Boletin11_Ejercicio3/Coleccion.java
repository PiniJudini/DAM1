package Boletin11_Ejercicio3;

import java.util.ArrayList;

public class Coleccion {
	private String titulo;
	private ArrayList<Integer> numeros = new ArrayList<>();
	private ArrayList<Integer> coleccionCompleta = new ArrayList<>();
	private int numero;
	
	public Coleccion(String t) {
		this.titulo = t;
	}
	
	public void setNumeroFinal(int n) {
		this.numero = n;
	}
	
	public void setNombre(String s) {
		this.titulo = s;
	}
	
	public String getNombre() {
		return this.titulo;
	}
	
	public void setNumero(int n) {
		int contador = 0;
		for(int i=0; i<this.numeros.size(); i++) {
			if(n==numeros.get(i))
				contador++;
		}
		if(contador==0)
			this.numeros.add(n);
		else
			System.out.println("Ya lo tienes");
	}
	
	public boolean compararNumero(int n) {
		boolean verdad;
		int contador = 0;
		for(int i=0; i<this.numeros.size(); i++) {
			if(n==numeros.get(i))
				contador++;
		}
		
		if(contador==0) {
			System.out.println("Ese número no lo tienes");
			verdad = false;
		}
		else {
			this.numeros.remove(Integer.valueOf(n));
			verdad = true;
		}
		return verdad;
	}
	
	public void mostrarRestantes() {
		System.out.print("Te faltan: ");
		for(int i=0; i<this.numero; i++) {
			this.coleccionCompleta.add(i+1);
		}
		
		for(int i=0; i<numeros.size(); i++) {
			this.coleccionCompleta.remove(numeros.get(i));
		}
		
		for(int i=0; i<coleccionCompleta.size(); i++)
			System.out.println(coleccionCompleta.get(i));
	}
}
