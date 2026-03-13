package Boletin13;

import java.lang.annotation.Documented;

public class Ciclo {
	private String nombre;
	private String grado;
	private Modulo[] primero = new Modulo[8];
	private Modulo[] segundo = new Modulo[8];
	private int contadorPrimero = 0;
	private int contadorSegundo = 0;
	private Modulo modulo;
	
	public Ciclo(String nombre, String grado) {
		this.nombre = nombre;
		this.grado = grado;
	}
	
	public void añadeModulo(Modulo m) {
		if(m.getCurso()==1) {
			primero[this.contadorPrimero] = m;
			contadorPrimero++;
		}
		else {
			segundo[this.contadorSegundo] = m;
			contadorSegundo++;
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void listar() {
		if(this.modulo.getCurso()==1) {
			do {
				System.out.println(this.modulo.getNombre());
			}while(this.primero!=null);
		}
		else {
			do {
				
			}while(this.segundo!=null);
		}
	}
}
