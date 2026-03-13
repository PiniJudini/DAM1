package EmpresaReparto;

public class Main {
	public static void main(String[] args) {
		Paquete p1 = new Paquete(33, 5,1);
		Paquete p2 = new Paquete(40,3,3);
		Paquete p3 = new Paquete(20,2,2);
		Camioneta c1 = new Camioneta(100,100);
		c1.calcularRuta();
		
	}
}
