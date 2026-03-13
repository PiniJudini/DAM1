package JJOO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

class DeporteI extends Deporte {
	private HashMap<Participante, Double> participantes = new HashMap<>();

	public DeporteI(String nombre) {
		super(nombre);
	}

	public void setResultado(Participante p, double m) {
		if (this.participantes.containsKey(p)) {
			if (this.participantes.get(p) < m)
				this.participantes.put(p, m);
		} else
			this.participantes.put(p, m);
	}

	public void obtenerPodio() {
		ArrayList<Double> numeros = new ArrayList<>();
		int j = 0;
		for (Double m : this.participantes.values()) {
			numeros.add(m);
		}
		
		Double[] numerines = numeros.toArray(new Double[0]);
		Arrays.sort(numerines);
		
		ArrayList<Double> doubles = new ArrayList<>();
		for(int i=numerines.length-1; i>=0; i--)
			doubles.add(numerines[i]);
		
		for (int k = 0; k < doubles.size(); k++) {
			for (Participante p : this.participantes.keySet()) {
				if (doubles.get(k) == this.participantes.get(p) && k<=2)
					System.out.println(k + 1 + " | " + p.getNombre() + ", " + this.participantes.get(p));
			}
		}
	}
}
