package EjercicioBanco;

import java.util.ArrayList;

public class Banco {
	private Sucursal sucursal;
	private String nombre;
	String codigo;
	ArrayList<Sucursal> sucursales= new ArrayList<>();
	
	public Banco(String n, String c) {
		this.nombre = n;
		this.codigo = c;
	}
	
	public void setSucursal(Sucursal s) {
		if(s.pillada == false) {
			this.sucursales.add(s);
			s.pillada = true;
		}
		else
			System.out.println("Ya está pillada");
	}
	
	public void mostrarSucursales() {
		for(int i=0; i<sucursales.size(); i++) {
			sucursales.get(i).mostrar();
		}
	}
}
