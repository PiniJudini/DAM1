package EjercicioAutoescuela;

public class Respuesta {
	private String opcion;
	private String respuesta;
	private boolean correcta;
	private int numero;
	
	public Respuesta(String r, boolean c) {
		this.correcta = c;
		this.respuesta = r;
	}
	
	public void setNumero(int n) {
		this.numero = n;
		if(n==0)
			this.opcion = "a";
		else if(n==1)
			this.opcion = "b";
		else
			this.opcion = "c";
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void mostrar() {
		System.out.println("---RESPUESTA---");
		System.out.println(this.opcion + " " + this.respuesta);
	}
	
	public boolean getCorrecta() {
		return this.correcta;
	}
}
