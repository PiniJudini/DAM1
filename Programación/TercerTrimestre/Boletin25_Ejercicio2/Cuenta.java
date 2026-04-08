package Boletin25_Ejercicio2;

public class Cuenta {
	private String codigo;
	private double saldo;
	private Cliente titular1;
	private Cliente titular2;
	private Sucursal sucursal;

	private static String codigoInicial = "ES68 1234";

	public Cuenta(String c, double s, Cliente t1, Sucursal sucursal) {
		this.codigo = c;
		this.saldo = s;
		this.titular1 = t1;
		this.sucursal = sucursal;

		t1.setCuenta(this);
	}

	public Cuenta(String c, int s, Cliente t1, Cliente t2, Sucursal sucursal) {
		this.codigo = c;
		this.saldo = s;
		this.titular1 = t1;
		this.titular2 = t2;
		this.sucursal = sucursal;

		t1.setCuenta(this);
		t2.setCuenta(this);
	}

	public void mostrarCuenta() {
		String iban = codigoInicial + " " + this.sucursal.getCodigo() + " " + this.codigo;
		System.out.printf("%25s - Saldo: %.2f€\n", iban, this.saldo);
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public String getLinea() {
		String iban = codigoInicial + " " + this.sucursal.getCodigo() + " " + this.codigo;
		String linea = iban + " - Saldo: " + this.saldo;
		return linea;
	}
}
