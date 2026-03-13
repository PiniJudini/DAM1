package DAM1;

public class Pokemon {
	private String nombre;
	private int codigopokedex;
	private String[] tipo = new String[2];
	private int pv;
	private Pokemon evolucion = null;
	
	public Pokemon(String nombre, int codigopokedex, String t) {
		this.nombre	= nombre;
		this.codigopokedex = codigopokedex;
		this.tipo[0] = t;
		this.pv = (int)((Math.random()*51)+50);
	}
	
	public Pokemon(String n, int c, String t1, String t2) {
		this.nombre	= n;
		this.codigopokedex = c;
		this.tipo[0] = t1;		
		this.tipo[1] = t2;
		this.pv = (int)((Math.random()*51)+50);
	}
	
	public void mostrar() {
		System.out.println("-----------------");
		System.out.println(this.codigopokedex + " - " + this.nombre);
		
		if(this.tipo[1]==null) 
			System.out.println("Tipo: " + this.tipo[0]);
		
		else
			System.out.println("Tipos: " + this.tipo[0] + ", " +this.tipo[1]);
		
		System.out.println("HP: " + this.pv);
		System.out.println("-----------------");
	}
	
	public void setEvolucion(Pokemon p) {
		this.evolucion = p;
	}
	
	public Pokemon evoluciona() {
		Pokemon pokemon = this;
		if(this.evolucion==null)
			System.out.println("No evoluciona");
		else
			pokemon = this.evolucion;
		return pokemon;
	}
	
	public void combate(Pokemon p) {
		//↓↓ Con este comando llamas al p que está fuera del parétesis (→p1←.combate(p3))
		Pokemon pokemon = this;
		Pokemon pokemon2 = p;
		boolean combateterminado;
		int vida1 = pokemon.pv;
		int vida2 = pokemon2.pv;
		String nombre1 = pokemon.nombre;
		String nombre2 = pokemon2.nombre;
		
		System.out.println("¡" + nombre1 + " ha atacado a " + nombre2 + "!");
		
		do {
			combateterminado = false;
			int ataque1 = (int)(Math.random()*(50-25+1)+25);
			int ataque2 = (int)(Math.random()*(50-25+1)+25);
			
			vida2 = vida2-ataque1;
			vida1 = vida1-ataque2;
			if(vida2<=0) {
				System.out.println("Ganador: " + nombre1);
				combateterminado = true;
			}
			else if(vida1<=0) {
				System.out.println("Ganador: " + nombre2);
				combateterminado = true;
			}
			else
				combateterminado = false;
			
			if(vida1>0)
				System.out.println("HP de " + nombre1 + " " +  vida1);
			if(vida2>0)
				System.out.println("HP de " + nombre2 + " " +  vida2);
		}while(combateterminado == false);
	}
}
