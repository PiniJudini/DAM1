package EjercicioBanco;

public class Cuenta {
	Cliente titular;
	Cliente titular2;
	private int saldo;
	private Sucursal sucursal;
	private String codigo;
	int contadorTitulares = 0;
	
	public Cuenta(int saldo,Sucursal s,String c) {
		this.saldo = saldo;
		this.sucursal = s;
		this.codigo = c;
	}
	
	public void mostrarTitulares() {
		if(contadorTitulares==0)
			System.out.println("No tiene titulares");
		else if(contadorTitulares == 1)
			titular.mostrar();
		else {
			titular.mostrar();
			titular2.mostrar();
		}
	}
	
	public void mostrar() {
		System.out.println("Saldo: " + this.saldo + " Código: " + this.codigo);
		this.mostrarIBAN();
	}
	
	public String hacerIBAN() {
		return this.sucursal.banco.codigo + " " + this.sucursal.codigo + " " + this.codigo;
	}
	
	public void mostrarIBAN() {
		System.out.println(this.hacerIBAN() + " - " + this.saldo + "€");
	}
}
