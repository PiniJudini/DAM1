package Protectora;

public class Main {
	public static void main(String[] args) {
		Protectora protectora = new Protectora("CawasakiVet");
		
		Perro perro1 = new Perro(23);
		Perro perro2 = new Perro(12, "Firulais");
		
		Cliente cliente1 = new Cliente("Marcos", "Pineros Quero", 33, 616312116);
		Cliente cliente2 = new Cliente("Andrés", "Ortega Cebriá", 20, 678513433);
		cliente2.adoptar(perro2);
		cliente1.adoptar(perro1);
		cliente1.adoptar(perro2);
		cliente1.adoptar(perro2);
		
		cliente1.mostrarAdoptados();
		cliente2.mostrarAdoptados();
		cliente1.contarAdoptados();
		cliente2.contarAdoptados();
		
		protectora.nuevoProtected(perro2);
		protectora.nuevoProtected(perro1);
		protectora.mostrarProtectora();
	}
}
