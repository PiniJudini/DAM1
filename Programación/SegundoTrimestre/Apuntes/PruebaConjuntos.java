package DAM1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PruebaConjuntos {
	public static void main(String[] args) {
		HashSet<Integer> numeros = new HashSet<>(Arrays.asList(1,44,55,67,77,23,15));
		ArrayList<Integer> listaNumeros = new ArrayList<>(List.of(2,55,6,2,3,77,8,55,1,2,6));
		int[] vector = {4,5,6,22,4,1,7,9};
		
		ArrayList<Integer> vectorLista = new ArrayList<>();
		for(int i=0; i<vector.length; i++)
			vectorLista.add(vector[i]);
		System.out.println(vectorLista);
		
		HashSet<Integer> vectorConjunto = new HashSet<>();
		for(int i=0; i<vector.length; i++)
			vectorConjunto.add(vector[i]);
		System.out.println(vectorConjunto);
		
		int[] vectorListaNumeros = new int[listaNumeros.size()];
		for(int i=0; i<listaNumeros.size(); i++)
			vectorListaNumeros[i] = listaNumeros.get(i);
	}
}
