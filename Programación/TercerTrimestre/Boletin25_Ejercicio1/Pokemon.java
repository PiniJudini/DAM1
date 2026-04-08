package Boletin25_Ejercicio1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

// Poner Serializable para poder guardar Objetos (IMPORTANTE).
public class Pokemon implements Serializable {  
    
    private int codigo;
    private String nombre;
    private String tipo1;
    private String tipo2;
    private int peso;
    private int altura;

    private static ArrayList<Pokemon> pokemons = new ArrayList<>();

    public Pokemon(int c, String n, String t, int p1, int p2, int a1, int a2) {
        this.codigo = c;
        this.nombre = n;
        this.tipo1 = t;

        if (p1 > p2)
            this.peso = (int) (Math.random() * (p1 - p2 + 1) + p2);
        else
            this.peso = (int) (Math.random() * (p2 - p1 + 1) + p1);

        if (a1 > a2)
            this.altura = (int) (Math.random() * (a1 - a2 + 1) + a2);
        else
            this.altura = (int) (Math.random() * (a2 - a1 + 1) + a1);

        pokemons.add(this);
    }

    public Pokemon(int c, String n, String t1, String t2, int p1, int p2, int a1, int a2) {
        this.codigo = c;
        this.nombre = n;
        this.tipo1 = t1;
        this.tipo2 = t2;

        if (p1 > p2)
            this.peso = (int) (Math.random() * (p1 - p2 + 1) + p2);
        else
            this.peso = (int) (Math.random() * (p2 - p1 + 1) + p1);

        if (a1 > a2)
            this.altura = (int) (Math.random() * (a1 - a2 + 1) + a2);
        else
            this.altura = (int) (Math.random() * (a2 - a1 + 1) + a1);

        pokemons.add(this);
    }
    
    public static void listarPokemons() {
    	ArrayList<Pokemon> pokes = leerFichero("/home/pinipon/salida.dat");
    	for(Pokemon pokemon: pokes) {
    		if(pokemon.tipo2 == null)
    			System.out.println("Nombre: " + pokemon.nombre + " Tipo: " + pokemon.tipo1);
    		else
    			System.out.println("Nombre: " + pokemon.nombre + " Tipo 1: " + pokemon.tipo1 + " Tipo 2: " + pokemon.tipo2);
    	}
    }

    public static void escribirFichero(String fichero) {
        try (ObjectOutputStream binario = new ObjectOutputStream(new FileOutputStream(fichero))) {
            binario.writeObject(pokemons);
        } catch (Exception e) {
            System.out.println("Error al escribir el fichero: " + e.getMessage());
        }
    }

    public static ArrayList<Pokemon> leerFichero(String fichero) {
        ArrayList<Pokemon> listaG = new ArrayList<>();
        try (ObjectInputStream binario = new ObjectInputStream(new FileInputStream(fichero))) {
            listaG = (ArrayList<Pokemon>) binario.readObject();
        } catch (Exception e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
        return listaG;
    }
}
