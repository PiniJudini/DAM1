package Furbo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Competicion {
	private HashSet<Equipo> equipos = new HashSet<>();
	private HashSet<Partido> partidos = new HashSet<>();
	private HashSet<Arbitro> arbitro = new HashSet<>();
	private ArrayList<Integer> puntos = new ArrayList<>();
	private HashSet<Jornada> jornadas = new HashSet<>();
	private String nombre;

	public Competicion(String nombre) {
		this.nombre = nombre;
	}

	public void añadeEquipo(Equipo e) {
		this.equipos.add(e);
	}

	public void añadeEquipos(ArrayList<Equipo> equipos) {
		this.equipos.addAll(equipos);
	}

	public void crearPartidos() {
		// Pasamos a ArrayList los equipos para poder manejar las posiciones.
		ArrayList<Equipo> equipos = new ArrayList<>(this.equipos);
		HashSet<Integer> numeros = new HashSet<>();
		// Generas nuúmeros random que no se repitan (por eso HashSet).
		do {
			int numero = (int) (Math.random() * (this.equipos.size() - 1 + 1) + 1);
			numeros.add(numero);
		} while (numeros.size() < this.equipos.size());
		
		// Creación de partidos (se pueden repetir los partidos, ARREGLAR)
		ArrayList<Integer> numeros1 = new ArrayList<>(numeros);
		int contador = 0;
		do {
			contador++;
			Jornada jornada = new Jornada(this,contador);
			// Desordenas los números para que los equipos se enfrenten a rivales diferentes (no al mismo todo el rato).
			Collections.shuffle(numeros1);
			
			// Creas un bucle que genere tanto el partido de local como el de visitante de los mismos rivales (por eso
			// de dos en dos)
			for (int i = 0; i < numeros1.size(); i += 2) {
				Partido partido = new Partido(equipos.get(numeros1.get(i) - 1), equipos.get(numeros1.get(i + 1) - 1));
				Partido partido2 = new Partido(equipos.get(numeros1.get(i + 1) - 1), equipos.get(numeros1.get(i) - 1));
				this.partidos.add(partido);
				this.partidos.add(partido2);
				jornada.añadirPartido(partido);
				jornada.añadirPartido(partido2);
				this.jornadas.add(jornada);
			}
		} while (contador<19);
	}

	public void verClasificacion() {
		// Cabecera de la clasificacion
		LocalDate fecha = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fechaHoy = fecha.format(formato);
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("Competición: %s   Clasificacion a dia: %s\n", this.nombre, fechaHoy);
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("%-2s | %-25s | %3s | %2s | %2s | %2s | %2s | %3s | %3s |\n","Pos", " Equipo", "Pts", "PJ", "PG", "PE",
				"PP", "GF", "GC");
		System.out.println("---------------------------------------------------------------------------");
		// Ordenar equipos
		ArrayList<Equipo> listaFinal1 = this.ordenarClasificacion();
		// Mostrar cada equipo de la lista
		int i=0;
		for (Equipo e : listaFinal1) {
			i++;
			int PJ = e.getPG() + e.getPP() + e.getPE();
			System.out.printf("%-3d | %-25s | %3s | %2s | %2s | %2s | %2s | %3s | %3s |\n",i, e.getNombre(), e.getPts(), PJ,
					e.getPG(), e.getPE(), e.getPP(), e.getGF(), e.getGC());
		}
		System.out.println("---------------------------------------------------------------------------");

	}
	
	public ArrayList<Equipo> ordenarClasificacion() {
		// Los HashSet son para no repetir ni puntuaciones ni goles para a la hora de comparar con los ArrayList
		// no haya duplicados y no meta equipos dos veces por repetir puntuación o goles.
		ArrayList<Equipo> equipos = new ArrayList<>(this.equipos);
		HashSet<Integer> positivos = new HashSet<>();
		HashSet<Integer> negativos = new HashSet<>();
		
		// Meter los avgs con golAvg positivo primero y luego los negativos
		for(int i=0; i<equipos.size(); i++) {
			if(equipos.get(i).getAvg()>=0)
				positivos.add(equipos.get(i).getAvg());
			else
				negativos.add(equipos.get(i).getAvg());
		}
		
		// Ordenar positivos y negativos
		ArrayList<Integer> golesPositivos = new ArrayList<>(positivos);
		
		// Los negativos se ordenan automáticamente
		ArrayList<Integer> golesNegativos = new ArrayList<>(negativos);
		
		// Funcion de ordenar por goles.
		ArrayList<Equipo> final1 = this.ordenarPorGoles(golesPositivos, golesNegativos, equipos);
		
		// Con la lista ordenada por golAvg de equipos extraemos los puntos (necesario HashSet para comparar una
		// puntuación sin repetición con los equipos).
		HashSet<Integer> puntos = new HashSet<>();
		for(int i=0; i<final1.size(); i++) {
			puntos.add(final1.get(i).getPts());
		}
		
		// Ordenar los puntos pasando a Array y usando sort invertido
		ArrayList<Integer> ordenada = new ArrayList<>(puntos);
		ArrayList<Equipo> finalito = this.ordenarPorPuntos(ordenada, final1);
		return finalito;
	}
	
	public ArrayList<Equipo> ordenarPorGoles(ArrayList<Integer> golesPositivos, ArrayList<Integer> golesNegativos, ArrayList<Equipo> equipos) {
		// Los positivos tenemos que pasarlos a Array para usar el sort e invertirlo (no funciona con Collections.reverse())
		Integer[] golesP = golesPositivos.toArray(new Integer[0]);
		Arrays.sort(golesP);
		golesPositivos.clear();
		for(int i=golesP.length-1; i>=0; i--)
			golesPositivos.add(golesP[i]);
		
		// Añadir los equipos de mejor a peor golAvg positivo
		ArrayList<Equipo> final1 = new ArrayList<>();
		for(int i=0; i<golesPositivos.size(); i++) {
			for(int j=0; j<equipos.size(); j++) {
				if(equipos.get(j).getAvg()==golesPositivos.get(i))
					final1.add(equipos.get(j));
			}
		}
		
		// Añadir los equipos de mejor a peor golAvg negativo
		for(int i=0; i<golesNegativos.size(); i++) {
			for(int j=0; j<equipos.size(); j++) {
				if(equipos.get(j).getAvg()==golesNegativos.get(i))
					final1.add(equipos.get(j));
			}
		}
		return final1;
	}
	
	public ArrayList<Equipo> ordenarPorPuntos(ArrayList<Integer> ordenada, ArrayList<Equipo> final1) {
		Integer[] puntillos = ordenada.toArray(new Integer[0]);
		Arrays.sort(puntillos);
		ordenada.clear();
		for(int i=puntillos.length-1; i>=0; i--)
			ordenada.add(puntillos[i]);
		
		// Añadir los equipos ordenados por golAvg mayor según la puntuación más alta a más baja.
		ArrayList<Equipo> finalito = new ArrayList<>();
		for(int i=0; i<ordenada.size(); i++) {
			for(int j=0; j<final1.size(); j++) {
				if(final1.get(j).getPts()==ordenada.get(i))
					finalito.add(final1.get(j));
			}
		}	
		return finalito;
	}
}