package Boletin24;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> compra = new ArrayList<>();
		String respuesta4 = "";
		double suma = 0;
		int contador = 0;
		
		do {
		System.out.println("Introduce un articulo: ");
		String respuesta1 = teclado.nextLine();
		
		System.out.println("Introduce la cantidad: ");
		String respuesta2 = teclado.nextLine();
		
		System.out.println("Introduce el precio: ");
		String respuesta3 = teclado.nextLine();
		
		System.out.println("Quieres seguir introduciendo artículos en la lista (si/no): ");
		respuesta4 = teclado.nextLine();
		
		suma += Double.parseDouble(respuesta3)*Double.parseDouble(respuesta2);
		
		compra.add(respuesta2 + " " + respuesta1);
		
		contador++;
		
		}while(respuesta4.equals("si"));
		
		compra.add("Total artículos en la lista: " + contador);
		compra.add("Precio de la compra: " + suma);
		
		escribirFichero(compra);
	}
	
	public static void escribirFichero(ArrayList<String> lineas) {
		Path rutaArchivo = Paths.get("/home/pinipon/compra.txt");
		try {
            Files.write(
            	rutaArchivo, 
                lineas, 
                StandardCharsets.UTF_8,
                // StandardOpenOption.CREATE crea el fichero si no existe. Si no lo ponemos generaría una excepción si el fichero no existe, pero si existe añade
                StandardOpenOption.CREATE,   
                StandardOpenOption.APPEND
            );
            
            System.out.println("Líneas añadidas correctamente");
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
	}
}
