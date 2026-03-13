package boletin10;

import java.util.Scanner;

public class Ejercicio4 {
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
			System.err.println("Has introducido una entrada incorrecta");
			correcto = false;
		}
		}while(correcto == false);
		
		int[] defectivos = new int[numero1];
		for (int i=1; i<numero1; i++) {
			int defectivo1 = i;
			if(comprobarPerfecto(defectivo1)==true) {
				defectivos[i]=defectivo1;
			}
		}
		
		int[] defectivos2 = new int[numero2];
		for (int i=1; i<numero2; i++) {
			int defectivo2 = i;
			if(comprobarPerfecto2(defectivo2)==true) {
				defectivos2[i]=defectivo2;
			}
		}
		comparacionDefectivos(defectivos,defectivos2);
	}
	
	public static boolean comprobarPerfecto(int defectivo1) {
		int resultado = 0;
		for(int i=1; i<=defectivo1; i++) {
			if(defectivo1%i==0) {
				resultado += i;
			}
		}
		int doble = 2*defectivo1;
		if(resultado < doble) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean comprobarPerfecto2(int defectivo2) {
		int resultado = 0;
		for(int i=1; i<=defectivo2; i++) {
			if(defectivo2%i==0) {
				resultado += i;
			}
		}
		int doble = 2*defectivo2;
		if(resultado < doble) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void comparacionDefectivos(int[] defectivos,int[] defectivos2) {
	if(defectivos.length>defectivos2.length) {
		for(int i=0; i<defectivos2.length; i++) {
			if(defectivos2[i]!=0 && defectivos[i]==defectivos2[i])
				System.out.println(defectivos2[i]);
		}
	}
	else {
		for(int i=0; i<defectivos.length; i++) {
			if(defectivos[i]!=0 && defectivos[i]==defectivos2[i])
				System.out.println(defectivos[i]);
		}
	}
	}
	}