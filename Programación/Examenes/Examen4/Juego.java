package Examen4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Juego {
	private int numJugadores;
	private int numInicial = 0;
	private int contadorPruebas = 0;
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	private static HashMap<Prueba, Integer> pruebas = new HashMap<>();
	
	public Juego(int numJugadores) {
		this.numJugadores = numJugadores;
		this.numInicial = numJugadores;
		
		for(int i=1; i<=this.numJugadores; i++) {
			Jugador jugador = new Jugador(i);
			this.jugadores.add(jugador);
		}
	}
	
	public void mostrarJugadores() {
		for (Jugador j: this.jugadores)
			System.out.println(j.getNumero());
	}
	
	public void nuevaPrueba(int eliminados) {
		Prueba prueba = new Prueba(eliminados);
		
		int operacion = this.numJugadores - eliminados;
		this.numJugadores = operacion;
		
		if(operacion>0) {
			this.contadorPruebas++;
			prueba.setNumPrueba(this.contadorPruebas);
			pruebas.put(prueba, eliminados);
			System.out.println("Empieza la prueba número " + this.contadorPruebas);
			System.out.println("Vamos a expulsar a " + eliminados + " jugadores.");
			
			do {
				int size = this.jugadores.size();
				int numero = (int)(Math.random()*(size-0+0));
				this.jugadores.remove(numero);
			}while(this.jugadores.size()>this.numJugadores);
			
			if(this.numJugadores==1) {
				System.out.println("\nEl juego de la gamba ha terminado!");
				System.out.println("El ganador es " + this.jugadores.get(0).getNumero());
			}
		}
		else {
			System.out.println("\n¡Pincha que nos quedamos sin ganador!");
		}
		
	}
	
	public void mostrarPruebas() {
		int i=1;
		int resta = this.numInicial;
		System.out.println("Numero de pruebas hechas hasta el momento: " + this.contadorPruebas);
		Iterator<Entry<Prueba, Integer>> iterador = pruebas.entrySet().iterator();
		while(iterador.hasNext() == true) {
			Entry<Prueba, Integer> persona = iterador.next();
			resta -= persona.getValue();
			System.out.println("\nPrueba numero: " + i + ". Expulsados: " + persona.getValue() + ". Restantes: " + resta);
			i++;
		}
	}
}
