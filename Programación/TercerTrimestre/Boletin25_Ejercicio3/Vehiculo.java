package Boletin25_Ejercicio3;

import java.time.LocalDate;

abstract class Vehiculo {
	protected String matricula;
	protected int añoVenta;
	protected Conductor conductor;
	protected String marca;

	protected Vehiculo(String matricula, int añoVenta, Conductor conductor) {
		this.matricula = matricula;
		this.añoVenta = añoVenta;
		this.conductor = conductor;
	}

	protected void mostrarPrecioSeguro() {
		System.out.println(
				"Vehículo: " + this.marca + ". Matrícula: " + this.matricula + ". Año de compra: " + this.añoVenta);
		System.out.println("Conductor: " + this.conductor.getNombre() + ". Edad: " + this.conductor.getEdad()
				+ ". Años de carnet: " + this.conductor.getAñosCarnet() + ". Puntos: " + this.conductor.getPuntos());

		if (this.marca.equals("coche"))
			System.out.println("Precio del seguro a todo riesgo: " + this.precioSeguroTR() + "€");

		System.out.println("Precio del seguro a terceros: " + this.precioSeguro() + "€");

		if (this.marca.equals("moto"))
			System.out.println("No se hacen seguros a todo riesgo a motos.");
	}

	protected int precioSeguro() {
		int seguro = 0;
		int año = LocalDate.now().getYear() + 1;
		int diferencia = año - (this.añoVenta);
		if (this.marca.equals("coche")) {
			seguro += diferencia * 250;

			if (this.conductor.getPuntos() < 8)
				seguro += 100;

			if (this.conductor.getEdad() < 24)
				seguro += 50;

			if (this.conductor.getAñosCarnet() < 2)
				seguro += 75;
		} else {
			seguro += diferencia * 200;

			if (this.conductor.getPuntos() < 8)
				seguro += 150;

			if (this.conductor.getEdad() < 24)
				seguro += 25;

			if (this.conductor.getAñosCarnet() < 2)
				seguro += 50;
		}

		return seguro;
	}

	protected int precioSeguroTR() {
		int seguro = 0;
		int año = LocalDate.now().getYear() + 1;
		int diferencia = año - (this.añoVenta);

		if (this.marca.equals("coche")) {

			if (diferencia == 1)
				seguro += 400;
			else if (diferencia == 2)
				seguro += 500;
			else if (diferencia == 3)
				seguro += 700;
			else
				seguro += diferencia * 250;

			if (this.conductor.getPuntos() < 8)
				seguro += 100;
		} else {
			seguro = 0;
		}

		return seguro;
	}
}
