package Furbo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Equipo madrid = new Equipo("Real Madrid CF");
		Equipo barca = new Equipo("FC Barclona");
		Equipo betis = new Equipo("Real Betis Balompie");
		Equipo sevilla = new Equipo("Sevilla CF");
		Equipo getafe = new Equipo("Getafe FC");
		Equipo leganes = new Equipo("Leganes CF");
		Equipo malaga = new Equipo("Málaga CF");
		Equipo depor = new Equipo("Deportivo a Coruña");
		Equipo racing = new Equipo("Racing de Santander");
		Equipo espanyol = new Equipo("RCD Espanyol");
		Equipo pateti = new Equipo("Patético de Madrid");
		Equipo villareal = new Equipo("Villareal");
		Equipo athletic = new Equipo("Athletic Club");
		Equipo lareal = new Equipo("Real Sociedad");
		Equipo celta = new Equipo("Celta de Vigo");
		Equipo osasuna = new Equipo("Osasuna");
		Equipo oviedo = new Equipo("Real Oviedo");
		Equipo valencia = new Equipo("Valencia CF");
		Equipo rayo = new Equipo("Rayo Vallecano");
		Equipo pinifc = new Equipo("Pini FC");
		Competicion laLiga = new Competicion("LaLiga EA Sports");
		ArrayList<Equipo> equipos = new ArrayList<>(
				List.of(madrid, barca, betis, sevilla, getafe, leganes, malaga, depor, racing, espanyol, pateti,
						villareal, athletic, lareal, celta, osasuna, oviedo, valencia, rayo, pinifc));
		laLiga.añadeEquipos(equipos);
		laLiga.crearPartidos();

		laLiga.verClasificacion();
	}
}
