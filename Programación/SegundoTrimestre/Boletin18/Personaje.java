package Boletin18;

import java.util.ArrayList;

public class Personaje {
	private String nombre;
	private ArrayList<Accesorio> inventario = new ArrayList<>();
	
	public Personaje(String n) {
		this.nombre = n;
	}
	
	public void setAccesorio(Accesorio a) {
		if(inventario.size()>=10)
			System.out.println("No se pueden añadir más accesorios a tu inventario");
		else if(a.getPillado()==true)
			System.out.println("El accesorio seleccionado está pillado");
		else {
			this.inventario.add(a);
			a.setPillado();
		}
	}
	
	public void eliminarAccesorio(Accesorio a) {
		if(this.inventario.contains(a)) {
			this.inventario.remove(a);
			a.setPillado();
		}
		else
			System.out.println("El accesorio no está en tu inventario");
	}
	
	public void mostrarInventario() {
		for(int i=0; i<this.inventario.size(); i++)
			this.inventario.get(i).mostrar();
	}
}
