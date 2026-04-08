package Boletin25_Ejercicio2;

public class Sucursal {
	private String direccion;
	private String provincia;
	private String codigo;

	public Sucursal(String d, String p, int c) {
		this.direccion = d;
		this.provincia = p;

		if (c < 10)
			this.codigo = "000" + c;
		else if (c < 100 && c >= 10)
			this.codigo = "00" + c;
		else if (c < 1000 && c >= 100)
			this.codigo = "0" + c;
		else
			this.codigo = "" + c;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public String getProvincia() {
		return this.provincia;
	}
}
