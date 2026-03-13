package DAM1;

import java.util.*;

public class Diccionarios {
	public static void main(String[] args) {
		HashMap<String, Double> sueldos = new HashMap<>();
		// El comando put introduce los valores al diccionario.
		sueldos.put("Jose María Morales", 3333.45);
		sueldos.put("Kerri Caberga", 1755.44);
		sueldos.put("Pini", 33333.33);
		
		System.out.println(sueldos);
		
		// Si la clave (primer valor) ya está en el diccionario, solo sustituira el valor de la clave (el salario)
		sueldos.put("Jose María Morales", 4444.44);
		System.out.println(sueldos);
		
		// El comando get busca y coje el valor de la clave nombre
		String nombre = "Pini";
		System.out.println("El sueldo de " + nombre + " es " + sueldos.get(nombre));
		
		// El remove elimina el valor y la clave introduciendo la clave que quieres eliminar.
		// El comando devuelve el valor (en este caso el salario).
		System.out.println(sueldos.remove("Pini"));
		System.out.println(sueldos);
		
		if(sueldos.containsKey(nombre))
			System.out.println("Esta en la lista");
		else
			System.out.println("No está en la lista");
		
		// Bucle de inspección de diccionarios
		for(String persona: sueldos.keySet()) {
			System.out.println(persona + " " + sueldos.get(persona));
		}
		
		for(Double sueldo: sueldos.values())
			System.out.println(sueldo);
		
		Iterator<Map.Entry<String, Double>> iterador = sueldos.entrySet().iterator();
		while(iterador.hasNext() == true) {
			Map.Entry<String, Double> persona = iterador.next();
			System.out.println(persona.getKey() + " " + persona.getValue());
		}
	}
}
