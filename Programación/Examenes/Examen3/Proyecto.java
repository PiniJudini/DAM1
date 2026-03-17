package Examen3;

import java.util.ArrayList;

public class Proyecto {
	private String nombre;
	private Jefe jefe;
	private String codigo;
	private int numDesarrolladores = 0;
	private ArrayList<Programador> desarrolladores = new ArrayList<>();
	private static int contador = 0;
	private int contadorDesarrolladores = 0;

	public Proyecto(String n, Jefe j, int nD) {
		this.nombre = n;
		this.jefe = j;
		this.numDesarrolladores = nD;
		this.setCodigo();
		this.mostrarInfoProyecto();
		j.setProyecto(this);
	}

	public Proyecto(String n, Jefe j) {
		this.nombre = n;
		this.jefe = j;
		this.setCodigo();
		this.mostrarInfoProyecto();
		j.setProyecto(this);
	}

	public void setCodigo() {
		contador++;
		if (contador < 10)
			this.codigo = "PRO-00" + contador;
		else if (contador >= 10 && contador < 100)
			this.codigo = "PRO-0" + contador;
		else
			this.codigo = "PRO-" + contador;
	}

	public void mostrarInfoProyecto() {
		if(this.numDesarrolladores == 0) {
			System.out.println("Proyecto: " + this.codigo + ". " + this.nombre + ". Jefe de");
			System.out.println("Proyectos: " + this.jefe.getNombre());
			System.out.println();
		}
		else {
			System.out.println("Proyecto: " + this.codigo + ". " + this.nombre + ". Jefe de");
			System.out.println("Proyectos: " + this.jefe.getNombre() + ". Desarrolladores asignados: " + this.numDesarrolladores);
			System.out.println();
		}
	}

	public void eliminarJefe(Jefe j) {
		this.jefe = null;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public Jefe getJefe() {
		return this.jefe;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public void setNumeroDesarrolladores(int n) {
		if(this.numDesarrolladores == 0)
			this.numDesarrolladores = n;
		else {
			System.out.println("Ya hay " + this.numDesarrolladores + " Desarrolladores asignados al proyecto " + this.codigo + ". Este dato");
			System.out.println("no puede cambiarse");
		}
	}

	public void setDesarrollador(Programador p) {
		if(this.numDesarrolladores!=0) {
			if(this.desarrolladores.size()>=this.numDesarrolladores) {
				System.out.println("No se puede asignar a " + p.getNombre() + " al proyecto " + this.codigo + ". Máximo de");
				System.out.println("desarrolladores cubierto");
			}
			else {
				this.contadorDesarrolladores++;
				this.desarrolladores.add(p);
				p.setProyecto(this);
				System.out.println(p.getNombre() + " asignado al proyecto " + this.codigo);
			}
		}
		else {
			System.out.println("No se puede asignar a " + p.getNombre() + " al proyecto " + this.codigo + ". No tiene");
			System.out.println("aún definido el número de desarrolladores");
		}
	}

	public void getNumeroDesarrolladores() {
		System.out.println(this.contadorDesarrolladores + " Desarrolladores asignados al proyecto " + this.codigo);
	}
}
