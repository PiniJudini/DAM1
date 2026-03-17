package Examen3;

// Falta poner el abstract public class Persona
public class Persona {
	protected String nombre;
	protected String codigo;
	protected double salario;
	private static int contador = 0;
	
	public Persona(String n, double s) {
		this.nombre = n;
		this.salario = s;
		this.setCodigo();
	}
	
	public void setCodigo() {
		if(this.codigo != null)
			System.out.println("Ya tiene codigo");
		else {
			contador++;
			if(contador<10)
				this.codigo = "EMP-00" + contador;
			else if(contador>=10 && contador<100)
				this.codigo = "EMP-0" + contador;
			else
				this.codigo = "EMP-" + contador;
		}
	}
	
	public void mostrarCodigo() {
		System.out.println(this.codigo);
	}
}
