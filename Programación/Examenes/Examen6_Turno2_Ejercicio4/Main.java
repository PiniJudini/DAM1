package Examen6_Turno2_Ejercicio4;

public class Main {
	
	public static void main(String[] args) {
		Calculo area = (lado1, lado2) -> Math.round((lado1*lado2)*1000d)/1000d;
		Calculo perimetro = (lado1, lado2) -> Math.round((lado1*2 + lado2*2)*1000d)/1000d;
		
		System.out.println(area.calcular(3.12, 3.47));
		System.out.println(perimetro.calcular(4.87, 2.67));
	}
}
