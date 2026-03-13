package EjercicioVehiculos;

import java.time.LocalDate;

class Coche extends Vehiculo{
	private int antiguedad;
	private int coste;
	public Coche(String matricula, int añoFabricacion, Conductor dueño) {
		super(matricula,añoFabricacion,dueño);
	}
	
	public int calculoDinero() {
		int año = LocalDate.now().getYear();
		antiguedad = año-this.añoFabricacion;
		coste = 400 + 500 + 700;
		if(antiguedad<=3) {
			if(antiguedad==1)
				coste = 400;
			else if(antiguedad==2)
				coste = 400 + 500;
			else
				coste = 400 + 700 + 500;
		}
		else {
			if(this.dueño.getPuntos()<=8)
				coste = coste + (antiguedad-3)*250 + antiguedad*100;
			else if(this.dueño.getPuntos()<=24 && this.dueño.getPuntos()>8)
				coste = coste + (antiguedad-3)*250 + antiguedad*50;
		}
		return coste;
	}
}
