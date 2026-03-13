package Protectora;

class Perro extends Animal {
	private boolean vacunado = false;
	public Perro(int añoN, String nombre) {
		super(añoN,nombre);
	}
	
	public Perro(int añoN) {
		super(añoN);
	}
	
	public void vacunar() {
		if(this.vacunado==false)
			this.vacunado = true;
		else
			System.out.println("El animal ya está vacunado");
		
	}
}