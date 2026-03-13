package DAM1;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		// Las listas tienen longitud variable. No hace falta poner una longitud inicial, pero la variable debe estar inicializada.
		ArrayList<String> textos = new ArrayList<>();
		ArrayList<Double> notas = new ArrayList<>();
		ArrayList<Integer> numeros = new ArrayList<>();
		
		ArrayList<Double> precios = new ArrayList<>();
		
		textos.add("Hola Mundo");
		textos.add("Mequetrefe");
		notas.add(9.5);
		precios.add(33.33);
		
		System.out.println(precios);
		System.out.println(textos);
		System.out.println(notas);
		
		System.out.println(textos.get(1));
		System.out.println(textos.size());
		
		ArrayList<String> alumnos = new ArrayList<>(List.of("Jaime","Adrián","Lucia","Oscar","Lucia"));
		if(alumnos.contains("Pepe"))
			System.out.println("Está en la lista");
		else
			System.out.println("No está en la lista");
		
		System.out.println(alumnos.indexOf("Lucia"));
		System.out.println(alumnos.lastIndexOf("Lucia"));
		// alumnos.remove devuelve true o false y solo elimina el primero si se repite
		System.out.println(alumnos.remove("Lucia"));
		// Para borrar con .remove un entero, usamos (Integer)
		System.out.println(numeros.remove((Integer)3));
		// .clear sirve para eliminar el array por completo
		numeros.clear();
		
		// isEmpty() verifica si la lista está vacía y devuelve true o false
		if(numeros.isEmpty()==true)
			System.out.println("La lista está vacía");
		
		// Hace falta castear el comando clone para duplicar la lista que queramos
		ArrayList alumnos2 = (ArrayList) alumnos.clone();
	}
}
