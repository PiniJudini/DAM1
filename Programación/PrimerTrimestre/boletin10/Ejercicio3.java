package boletin10;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		
		boolean correcto;
		do {
		try {
			Scanner teclado = new Scanner (System.in);
			System.out.print("Introduce un número: ");
			numero1 = teclado.nextInt();
			System.out.print("Introduce otro número: ");
			numero2 = teclado.nextInt();
			correcto=true;
			teclado.close();
		}catch(Exception e) {
			System.out.println("Has introducido una entrada incorrecta");
			correcto = false;
		}
		}while(correcto == false);
		
		int[] abundantes = new int[numero1];
		for (int i=1; i<numero1; i++) {
			int abundante1 = i;
			if(comprobarAbundante(abundante1)==true) {
				abundantes[i]=abundante1;
			}
		}
		
		int[] abundantes2 = new int[numero2];
		for (int i=1; i<numero2; i++) {
			int abundante2 = i;
			if(comprobarAbundante2(abundante2)==true) {
				abundantes2[i]=abundante2;
			}
		}
		comparacionDefectivos(abundantes,abundantes2);
	}
	
	public static boolean comprobarAbundante(int abundante1) {
		int resultado = 0;
		for(int i=1; i<abundante1; i++ ) {
			if(abundante1%i==0) {
				resultado += i;
			}
		}
		if(resultado > abundante1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean comprobarAbundante2(int abundante2) {
		int resultado = 0;
		for(int i=1; i<abundante2; i++) {
			if(abundante2%i==0) {
				resultado += i;
			}
		}
		if(resultado > abundante2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void comparacionDefectivos(int[] abundantes,int[] abundantes2) {
		if(abundantes.length>abundantes2.length) {
			for(int i=0; i<abundantes2.length; i++) {
				if(abundantes2[i]!=0 && abundantes[i]==abundantes2[i])
					System.out.println(abundantes2[i]);
			}
		}
		else {
			for(int i=0; i<abundantes.length; i++) {
				if(abundantes[i]!=0 && abundantes[i]==abundantes2[i])
					System.out.println(abundantes[i]);
			}
		}
		}
	}