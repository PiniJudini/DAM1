package DAM1;

public class Pool2 {
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon("Bulbasaur",12,"Planta");
		Pokemon p2 = new Pokemon("Charizard",1,"Fuego","Volador");
		Pokemon p3 = new Pokemon("Venasaur",3,"Planta");
		Pokemon p4 = new Pokemon("Pikachu",25,"Eléctrico");
		Pokemon p5 = new Pokemon("Newtho",5,"Oscuro");
		
/*		p1.setEvolucion(p3);
		p1.mostrar();
		System.out.println("----------------------");
		p2.mostrar();
		p2.evoluciona(); */
		
		Equipo equipo1 = new Equipo("Capitán Salami",p1,p2,p4);
		equipo1.mostrar();
		p1.combate(p5);
	}
}
