package Examen3;

public class Main {
	public static void main(String[] args) {
		Programador p = new Programador("Zishan", 2908);
		Programador p1 = new Programador("Marcos", 3333, "Java");
		Jefe j1 = new Jefe("Andrés",4500);
		Programador p2 = new Programador("Andrea", 3344, "Java", "Python");
		Jefe j2 = new Jefe("Natalia", 8000);
		Proyecto pro1 = new Proyecto("MK9000",j1, 2);
		Proyecto pro2 = new Proyecto("MK8090", j2);
		
		j1.cambiarProyecto(pro2);
		j1.cambiarProyecto(pro2);
		System.out.println();
		
		pro1.getNumeroDesarrolladores();
		System.out.println();
		
		pro1.setDesarrollador(p);
		pro1.setDesarrollador(p1);
		pro1.getNumeroDesarrolladores();
		System.out.println();
		
		pro1.setDesarrollador(p2);
		System.out.println();
		pro1.getNumeroDesarrolladores();
		pro2.setDesarrollador(p2);
		
		p1.calcularSalario();
	}
}
