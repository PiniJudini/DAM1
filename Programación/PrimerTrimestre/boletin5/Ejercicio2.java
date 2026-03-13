package boletin5;

import java.util.Arrays;

public class Ejercicio2 {
	public static void main(String[] args) {
		int numero1 = 8;
		int[] divisores = new int[numero1+1];
		for(int i=1; i<=numero1; i++) {
			if(numero1%i==0)
				divisores[i]=i;
		}
		
		int numero2 = 16;
		int[] divisores2 = new int[numero2+1];
		for (int i=1; i<=numero2; i++) {
			if(numero2%i==0) {
				divisores2[i]=i;
			}
		}
		
		if(divisores.length>divisores2.length) {
			for (int i=0; i<divisores2.length; i++) {
				if(divisores[i]==divisores2[i] && divisores2[i]!=0)
					System.out.println(divisores2[i]);
			}
		}
		
		else {
			for (int i=0; i<divisores.length; i++) {
				if(divisores[i]==divisores2[i] && divisores[i]!=0)
					System.out.println(divisores[i]);
			}
		}
	}
}
