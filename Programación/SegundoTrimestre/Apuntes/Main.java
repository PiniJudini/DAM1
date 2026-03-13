package DAM1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> desordenada = new ArrayList<>(List.of(7,1,3,5,4,6));
		ordenarPorBurbuja(desordenada);
		ordenarPorSeleccion(desordenada);
	}
	
	public static ArrayList<Integer> ordenarPorSeleccion(ArrayList<Integer> desordenada) {
		ArrayList<Integer> ordenada = new ArrayList<>();
		int size = desordenada.size();
		for(int i=0; i<size; i++) {
			ordenada.add(Collections.max(desordenada));
			desordenada.remove(Collections.max(desordenada));
		}
		return ordenada;
	}
	
	public static ArrayList<Integer> ordenarPorBurbuja(ArrayList<Integer> desordenada) {
		boolean cambio = false;
		do {
			cambio = false;
			for(int i=0; i<desordenada.size()-1; i++) {
				if(desordenada.get(i+1) > desordenada.get(i)) {
					desordenada.add(i+1, desordenada.remove(i));
					cambio = true;
				}
			}
		}while(cambio == true);
		System.out.println(desordenada);
		return desordenada;
	}
}
