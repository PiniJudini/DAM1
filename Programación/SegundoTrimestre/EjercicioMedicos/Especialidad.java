package EjercicioMedicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Especialidad {
	private String nombre;
	private HashSet<Medico> medicos = new HashSet<>();
	
	public Especialidad(String nombre) {
		this.nombre = nombre;
	}
	
	public void setMedico(Medico m) {
		int numero = this.medicos.size();
		this.medicos.add(m);
		if(this.medicos.size()==numero)
			System.out.println("El médico ya estaba");
		else
			System.out.println("Médico añadido a la especialidad " + this.nombre);
	}
	
	public void listarMedicos() {
		if(this.medicos.size()==0)
			System.out.println("No tienes médicos en la especialidad " + this.nombre);
		else {
			System.out.println("---LISTA DE MÉDICOS DE " + this.nombre.toUpperCase() + "---");
			for(Medico medico:this.medicos)
				System.out.println(medico.getNombre() + " " + medico.getNumeroPacientes());
		}
	}
	
	public void sacarMinimo() {
		int minimo = 0;
		ArrayList<Medico> medicos2 = new ArrayList<>(this.medicos);
		ArrayList<Integer> numCitas = new ArrayList<>();
		for (int i=0; i<medicos2.size(); i++)
			numCitas.add(medicos2.get(i).getNumeroPacientes());
		
		Collections.sort(numCitas);
		minimo = numCitas.get(0);
		System.out.println(minimo);
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
