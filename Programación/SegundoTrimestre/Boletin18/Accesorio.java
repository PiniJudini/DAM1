package Boletin18;

public class Accesorio {
	private String nombre;
	private int valor;
	private boolean pillado = false;
	
	public Accesorio(String n, int v) {
		this.nombre = n;
		this.valor = v;
	}
	
	public void setPillado() {
		if(this.pillado == false)
			this.pillado = true;
		else
			this.pillado = false;
	}
	
	public boolean getPillado() {
		return this.pillado;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public void mostrar() {
		System.out.println("---ACCESORIO---");
		System.out.println("Nombre: " + this.nombre + " Valor: " + this.valor);
	}
}
