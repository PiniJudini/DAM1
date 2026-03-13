package EmpresaReparto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Camioneta {
	private HashMap<Paquete, Double> distancias = new HashMap<>();
	private int pesoMax;
	private int kmMax;
	private Ubicacion ubi;
	private Ruta ruta = new Ruta();

	public Camioneta(int pesoMax, int kmMax) {
		this.pesoMax = pesoMax;
		this.kmMax = kmMax;
		this.ubi = new Ubicacion(0,0);
	}
	
	public void calcularRuta() {
		Paquete cerca = Paquete.masCercano(this.ubi);
		do {
			cerca = Paquete.masCercano(this.ubi);
			System.out.println(cerca.distancia(this.ubi));
			ruta.añadirPaquete(cerca);
			if(cerca != null) {
				this.ubi = cerca.getUbicacion();
				Paquete.eliminarPaquete(cerca);
				System.out.println(cerca.distancia(ubi));
			}
		}while(cerca != null);
	}
	
}
