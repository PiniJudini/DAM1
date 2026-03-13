package Furbo;

import java.util.ArrayList;

public class Jornada {
	private ArrayList<Partido> partidos = new ArrayList<>();
	private Competicion competicion;
	private int numJornada;
	
	public Jornada(Competicion competicion, int numJornada) {
		this.competicion = competicion;
		this.numJornada = numJornada;
	}
	
	public void añadirPartido(Partido p) {
		this.partidos.add(p);
	}
}
