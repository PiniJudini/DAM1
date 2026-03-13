package EjercicioBanco;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String nif;
	private int telefono;
	private Sucursal sucursal;
	private boolean titular = false;
	private ArrayList<Cuenta> cuentas = new ArrayList<>();
	
	public Cliente(String n, String a, String nif, int t) {
		this.nombre = n;
		this.apellidos = a;
		this.nif = nif;
		this.telefono = t;
	}
	
	public void setTitular(Cuenta c) {
		if(c.titular == null)
			this.cuentas.add(c);
		else if(c.titular == this)
			System.out.println("Ya eres el titular de esta cuenta");
		else if(c.titular2 == null)
			this.cuentas.add(c);
		else if(c.titular2 == this)
			System.out.println("Ya eres el titular de esta cuenta");
			
		if(c.contadorTitulares==2)
			System.out.println("No se pueden tener más titulares");
		else if(c.contadorTitulares == 0){
			c.titular = this;
			c.contadorTitulares++;
		}
		else {
			c.titular2 = this;
			c.contadorTitulares++;
		}
			
	}
	
	public void mostrar() {
		System.out.println("Nombre: " + this.nombre + " Apellidos: " + this.apellidos);
		System.out.println("NIF: " + this.nif + " Teléfono: " + this.telefono);
	}
	
	public void mostrarCuentas() {
		for(int i=0; i<cuentas.size(); i++) {
			cuentas.get(i).mostrar();
		}
	}
}
