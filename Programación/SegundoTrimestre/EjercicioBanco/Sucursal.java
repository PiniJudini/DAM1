package EjercicioBanco;

import java.util.ArrayList;

public class Sucursal {
	Banco banco;
	private String calle;
	private int numero;
	private int cpostal;
	private String ciudad;
	int codigo;
	boolean pillada = false;
	private ArrayList<Cliente> clientes = new ArrayList<>();
	
	public Sucursal(Banco b,String c, int n, int cp, String city, int cd) {
		this.banco = b;
		this.calle = c;
		this.numero = n;
		this.cpostal = cp;
		this.ciudad = city;
		this.codigo = cd;
	}
	
	public void mostrar() {
		System.out.println("Calle: "+ this.calle + " Número: " + this.numero);
		System.out.println("Ciudad: " + this.ciudad + " CP: " + this.cpostal);
		System.out.println("Código: " + this.codigo);
	}
	
	public void añadirCliente(Cliente c) {
		clientes.add(c);
	}
	
	public void mostrarClientes() {
		for(int i=0; i<clientes.size(); i++)
			clientes.get(i).mostrar();
	}
}
