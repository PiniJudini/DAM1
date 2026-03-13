package EmpresaReparto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Paquete {
	private static HashSet<Paquete> almacen = new HashSet<>();
	private int x;
	private int y;
	private Ubicacion ubi;
	private double peso;
	
	public Paquete(double peso, int x, int y) {
		this.peso = peso;
		this.ubi = new Ubicacion(x,y);
		almacen.add(this);
	}
	
	public static void eliminarPaquete(Paquete p) {
		almacen.remove(p);
	}
	
	public Ubicacion getUbicacion() {
		return this.ubi;
	}
	
	public static Paquete masCercano(Ubicacion furgo) {
		HashSet<Double> distancias = new HashSet<>();
		ArrayList<Paquete> paquetillos = new ArrayList<>(almacen);
		for(int i=0; i<paquetillos.size(); i++) {
			distancias.add(paquetillos.get(i).distancia(furgo));
		}
		
		ArrayList<Double> distancias3 = new ArrayList<>(distancias);
		
		Paquete ganador = null;
		for(int i=0; i<paquetillos.size(); i++) {
			if(Collections.min(distancias3)==paquetillos.get(i).distancia(furgo))
				ganador = paquetillos.get(i);
		}
		return ganador;
	}
	
	public double distancia(Ubicacion destino) {
		double valor1 = Math.pow((destino.obtenerX()-this.ubi.obtenerX()), 2);
		double valor2 = Math.pow((destino.obtenerY()-this.ubi.obtenerY()), 2);
		
		double distancia = Math.round(Math.sqrt(valor1+valor2)*1000d)/1000d;
		return distancia;
	}
}
