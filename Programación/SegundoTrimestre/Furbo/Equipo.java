package Furbo;

import java.util.HashSet;

public class Equipo {
	private HashSet<Jugador> jugadores = new HashSet<>();
	private String nombre;
	private boolean corrupto;
	private Entrenador entrenador;
	private int puntos = 0;
	private int golesafavor = 0;
	private int golesencontra = 0;
	private int partidosGanados= 0;
	private int partidosEmpatados= 0;
	private int partidosPerdidos = 0;
	
	
	public Equipo(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEntrenador(Entrenador e) {
		if(this.entrenador!=null)
			System.out.println("El equipo " + this.nombre + " ya tiene entrenador");
		else
			this.entrenador = e;
	}
	
	public void setJugador(Jugador j) {
		if(this.entrenador!=null)
			System.out.println("El equipo " + this.nombre + " ya tiene al jugador " + j.getNombre());
		else
			this.jugadores.add(j);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void añadirPuntos(int n) {
		this.puntos += n;
	}
	
	public void añadirGoles(int n, int n2) {
		this.golesafavor += n;
		this.golesencontra += n2;
	}
	
	public void añadirVictoria() {
		this.partidosGanados += 1;
	}
	
	public void añadirDerrota() {
		this.partidosPerdidos += 1;
	}
	
	public void añadirEmpate() {
		this.partidosEmpatados += 1;
	}
	public void mostrarGoles() {
		System.out.println(this.golesafavor);
		System.out.println(this.golesencontra);
	}
	
	public int getPts() {
		return this.puntos;
	}
	public int getPG() {
		return this.partidosGanados;
	}
	
	public int getPP() {
		return this.partidosPerdidos;
	}
	
	public int getPE() {
		return this.partidosEmpatados;
		
	}
	public int getGF() {
		return this.golesafavor;
	}
	
	public int getGC() {
		return this.golesencontra;
	}
	
	public int getAvg() {
		return this.golesafavor-this.golesencontra;
	}
}
