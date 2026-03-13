package Tinder;

import java.util.ArrayList;
import java.util.HashSet;

public class App {
	private static HashSet<GrrGrr> chicas = new HashSet<>();
	private static HashSet<BoiBoi> chicos = new HashSet<>();

	public static void buscaMatches(BoiBoi b) {
		ArrayList<BoiBoi> boibois = new ArrayList<>(chicos);
		ArrayList<GrrGrr> grrgrrs = new ArrayList<>(chicas);
		ArrayList<Persona> matches = new ArrayList<>();
		boibois.remove(b);

		if (b.edadMax != 0 && b.edadMin != 0) {
			if (b.busqueda == 0) {
				for (GrrGrr g : grrgrrs) {
					if (g.edad >= b.edadMin && g.edad <= b.edadMax && g.busqueda != 0)
						matches.add(g);
				}
			} else if (b.busqueda == 1) {
				for (BoiBoi v : boibois) {
					if (v.edad >= b.edadMin && v.edad <= b.edadMax && v.busqueda != 0)
						matches.add(v);
				}
			} else {
				for (BoiBoi v : boibois) {
					if (v.edad >= b.edadMin && v.edad <= b.edadMax && v.busqueda != 0)
						matches.add(v);
				}
				for (GrrGrr g : grrgrrs) {
					if (g.edad >= b.edadMin && g.edad <= b.edadMax && g.busqueda != 0)
						matches.add(g);
				}
			}
		} else {
			if (b.busqueda == 0) {
				for (GrrGrr g : grrgrrs)
					if (g.busqueda != 0)
						matches.add(g);
			} else if (b.busqueda == 1) {
				for (BoiBoi v : boibois)
					if (b.busqueda != 0)
						matches.add(v);
			} else {
				for (BoiBoi v : boibois)
					if (v.busqueda != 0)
						matches.add(v);
				for (GrrGrr g : grrgrrs)
					if (g.busqueda != 0)
						matches.add(g);
			}
		}

		for (Persona p : matches)
			p.getDatos();
	}

	public static void buscaMatches(GrrGrr g) {
		ArrayList<BoiBoi> boibois = new ArrayList<>(chicos);
		ArrayList<GrrGrr> grrgrrs = new ArrayList<>(chicas);
		ArrayList<Persona> matches = new ArrayList<>();
		grrgrrs.remove(g);

		if (g.edadMax != 0 && g.edadMin != 0) {
			if (g.busqueda == 0) {
				for (GrrGrr v : grrgrrs) {
					if (g.edad >= v.edadMin && g.edad <= v.edadMax && v.busqueda != 1)
						matches.add(v);
				}
			} else if (g.busqueda == 1) {
				for (BoiBoi v : boibois) {
					if (v.edad >= g.edadMin && v.edad <= g.edadMax && v.busqueda != 1)
						matches.add(v);
				}
			} else {
				for (BoiBoi v : boibois) {
					if (v.edad >= g.edadMin && v.edad <= g.edadMax && v.busqueda != 1)
						matches.add(v);
				}
				for (GrrGrr v : grrgrrs) {
					if (v.edad >= g.edadMin && v.edad <= g.edadMax && v.busqueda != 1)
						matches.add(v);
				}
			}
		} else {
			if (g.busqueda == 0) {
				for (GrrGrr v : grrgrrs)
					if (v.busqueda != 1)
						matches.add(v);
			} else if (g.busqueda == 1) {
				for (BoiBoi v : boibois)
					if (v.busqueda != 1)
						matches.add(v);
			} else {
				for (BoiBoi v : boibois)
					if (v.busqueda != 1)
						matches.add(v);
				for (GrrGrr v : grrgrrs)
					if (v.busqueda != 1)
						matches.add(v);
			}
		}

		for (Persona p : matches)
			p.getDatos();
	}

	public static void setPersona(GrrGrr g) {
		chicas.add(g);
	}

	public static void setPersona(BoiBoi b) {
		chicos.add(b);
	}
}