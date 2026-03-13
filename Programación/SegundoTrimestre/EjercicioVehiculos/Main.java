package EjercicioVehiculos;

public class Main {
	public static void main(String[] args) {
		Conductor conductor1 = new Conductor("03492765P", 2007, 2026, 15);
		Conductor conductor2 = new Conductor("12345678P", 2001, 2020, 8);
		Coche coche1 = new Coche("0033-OFA", 2004, conductor1);
		
		conductor1.obtenerDatos();
		conductor2.obtenerDatos();
	}
}
