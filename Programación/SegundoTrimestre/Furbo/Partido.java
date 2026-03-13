package Furbo;

import java.util.ArrayList;
import java.util.HashSet;

public class Partido {
	private ArrayList<Equipo> partido = new ArrayList<>();
	private Equipo ganador;
	
	public Partido(Equipo e1, Equipo e2) {
		this.partido.add(e1);
		this.partido.add(e2);
		
		int goles1 = (int)(Math.random()*(3-0+1)+0);
		int goles2 = (int)(Math.random()*(3-0+1)+0);
		
		e1.añadirGoles(goles1, goles2);
		e2.añadirGoles(goles2, goles1);
		
		if(goles1>goles2)
			this.ganador = e1;
		else if(goles2>goles1)
			this.ganador = e2;
		else
			this.ganador = null;
		
		if(this.ganador==e1) {
			e1.añadirPuntos(3);	
			e1.añadirVictoria();
			e2.añadirDerrota();
		}
		else if(this.ganador==e2) {
			e2.añadirPuntos(3);
			e1.añadirDerrota();
			e2.añadirVictoria();
		}
		else {
			e1.añadirPuntos(1);
			e2.añadirPuntos(1);
			e1.añadirEmpate();
			e2.añadirEmpate();
		}
	}
	
	public String getEquipos() {
		return this.partido.get(0).getNombre() + " vs. " + this.partido.get(1).getNombre();
	}
	
	
}
