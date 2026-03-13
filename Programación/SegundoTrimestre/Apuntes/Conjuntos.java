package DAM1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Conjuntos {
	
	public static void main(String[] args) {
		HashSet<String> alumnos = new HashSet<>();
		HashSet<String> profes = new HashSet<>(Arrays.asList("Pinipon","Yago Navarrate"));
		System.out.println(alumnos);
		System.out.println(profes);
		profes.add("Pinipon");
		System.out.println(profes.add("Pinipon"));
		System.out.println(profes);
		
		if(profes.contains("Pinipon"))
			System.out.println("Está en la lista");
		else
			System.out.println("No está en la lista");
		
		profes.remove("Pinipon");
		
		// En los HashSet no se pueden repetir datos
		ArrayList<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,4,7,2,4,2,5,7,9,0,6,8));
		System.out.println(numeros);
		HashSet<Integer> numerosUnicos = new HashSet<>(numeros);
		System.out.println(numerosUnicos);
		numeros = new ArrayList<Integer>(numerosUnicos);
		System.out.println(numeros);
		
		HashSet<Integer> otrosNumeros = numerosUnicos;
		HashSet<Integer> otrosNumeros2 = new HashSet<>(numerosUnicos);
		
		HashSet<Integer> conjunto1 = new HashSet<>(Arrays.asList(1,2,3,4,5,9));
		HashSet<Integer> conjunto2 = new HashSet<>(Arrays.asList(7,8,4,5));
		
		// Unión
		conjunto2.addAll(conjunto1);
		System.out.println(conjunto2);
		
		// Intersección
		conjunto2.retainAll(conjunto1);
		System.out.println(conjunto2);
		
		// Diferencia
		conjunto2.removeAll(conjunto1);
		System.out.println(conjunto2);
		
		HashSet<Integer> primitiva = new HashSet<>();
		int contador = 0;
		do {
			int numero = (int)(Math.random()*(49-1+1)+1);
			primitiva.add(numero);
		}while(primitiva.size()<6);
		
		System.out.println(primitiva);
		
	}
}
