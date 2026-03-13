package EmpresaReparto;

import java.util.ArrayList;

public class Ruta {
	private ArrayList<Paquete> paquetes = new ArrayList<>();
	
	public Ruta() {
		
	}
	
	public void añadirPaquete(Paquete p) {
		this.paquetes.add(p);
	}
}
