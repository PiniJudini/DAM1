package Boletin25_Ejercicio2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String nif;
	private int telefono;
	private Sucursal sucursal;

	private ArrayList<Cuenta> cuentas = new ArrayList<>();

	public Cliente(String n, String a, String nif, int tlfn, Sucursal s) {
		this.nombre = n;
		this.apellidos = a;
		this.nif = nif;
		this.telefono = tlfn;
		this.sucursal = s;
	}

	public void setCuenta(Cuenta c) {
		this.cuentas.add(c);
	}

	public void listarCuentas() {
		System.out.println(this.nombre + " " + this.apellidos + ". Cliente de la sucursal " + this.sucursal.getCodigo()
				+ " (" + this.sucursal.getProvincia() + ")");
		for (Cuenta cuenta : cuentas)
			cuenta.mostrarCuenta();
		System.out.println("Saldo total: " + this.calcularSaldo() + "€");
	}

	public double calcularSaldo() {
		double suma = 0;
		for (Cuenta cuenta : cuentas)
			suma += cuenta.getSaldo();

		return suma;
	}

	public void escribirFichero(String fichero) {
		Path rutaArchivo = Paths.get("/home/pinipon/" + fichero);
		try {
			int i = 0;
			for (Cuenta cuenta : this.cuentas) {
				String linea = cuenta.getLinea() + "\n";
				if (i == 0)
					Files.writeString(rutaArchivo, linea, StandardCharsets.UTF_8);
				else
					Files.writeString(rutaArchivo, linea, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
							StandardOpenOption.APPEND);
				i++;
			}

			String linea = "Saldo total: " + this.calcularSaldo() + "€";
			Files.writeString(rutaArchivo, linea, StandardCharsets.UTF_8, StandardOpenOption.APPEND);

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
