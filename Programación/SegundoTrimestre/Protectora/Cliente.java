package Protectora;

import java.util.Scanner;

public class Cliente {
	private String nombre;
	private String apellidos;
	private int edad;
	private int tlfn;
	private int contadorArray = 0;
	private Animal[] adoptados = new Animal[6];
	private int contador = 0;
	public Cliente(String nombre, String apellidos, int edad, int tlfn) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.tlfn = tlfn;
	}
	
	public void adoptar(Animal animal) {
		this.adoptados[this.contadorArray] = animal;
		this.contadorArray++;
	}
	
	public void mostrarAdoptados() {
		for(int i=0; i<adoptados.length; i++)
			System.out.println(adoptados[i]);
	}
	
	public void contarAdoptados() {
		for(int i=0; i<adoptados.length; i++) {
			if(adoptados[i]!=null)
				this.contador++;
		}
		System.out.println(this.contador);
	}
}
