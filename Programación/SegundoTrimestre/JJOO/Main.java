package JJOO;

public class Main {
	public static void main(String[] args) {
		Participante p1 = new Participante("Zevinno Sobretti", "Italia");
		Participante p2 = new Participante("Kepo John", "EEUU");
		Participante p3 = new Participante("Fer Danilo", "Brasil");
		Participante p4 = new Participante("Yotoko Tutoto", "Japón");
		Participante p5 = new Participante("Mepa Geo", "Grecia");
		Participante p6 = new Participante("Alma Madero", "México");
		Participante p7 = new Participante("Isidro Gamos Alcura", "España");
		Participante p8 = new Participante("Alba Jarlamama", "Colombia");
		Participante p9 = new Participante("Gain Eagers", "EEUU");
		Participante p10 = new Participante("Mike Oxlong", "England");
		Participante p11 = new Participante("Missué Villos", "Francia");
		Participante p12 = new Participante("Elver Gomez Torba", "España");
		Participante p13 = new Participante("Alma Marcela Silva de Alegría","Ecuador");
		Participante p14 = new Participante("Kepa Jamecho", "España");
		Participante p15 = new Participante("Tusco Jones", "England");
		Participante p16 = new Participante("Akito Koteta", "Japón");				
		
		DeporteI d1 = new DeporteI("Japotrómetro");
		DeporteC d2 = new DeporteC("Cagada Olímpica");
		DeporteC d3 = new DeporteC("Paciencia");
		
		Equipo e1 = new Equipo("Colombia", d2);
		Equipo e2 = new Equipo("EEUU", d3);
		
		e1.setParticipante(p8);
		
		d1.setResultado(p1, 43.33);
		d1.setResultado(p2, 43.33);
		d1.setResultado(p3, 3.33);
		d1.setResultado(p5, 11.33);
		d1.obtenerPodio();
	}
}
