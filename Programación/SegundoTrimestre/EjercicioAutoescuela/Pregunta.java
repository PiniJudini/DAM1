package EjercicioAutoescuela;

import java.util.ArrayList;

public class Pregunta {
	private String pregunta;
	private int numero;
	private Respuesta[] preguntita = new Respuesta[3];
	private static ArrayList<Pregunta> preguntas = new ArrayList<>();
	
	public Pregunta(String p) {
		this.pregunta = p;
		preguntas.add(this);
	}
	
	public void generarRespuestas(Respuesta r1, Respuesta r2, Respuesta r3) {
        int[] numeros = new int[3]; 
        int contador = 0;
        
        while(contador < 3) {
            int numero;
            boolean repetido;   
            do {
                numero = (int)(Math.random() * 3)+1;
                repetido = false;
                // Verificar repetición
                for(int i = 0; i < contador; i++) {
                    if(numeros[i] == numero) {
                        repetido = true;
                    }
                }
            } while(repetido);  // Equivale a while(repetido == true)
            
            numeros[contador] = numero;
            contador++;
        }
        
        r1.setNumero(numeros[2]);
        r2.setNumero(numeros[0]);
        r3.setNumero(numeros[1]);
        
        preguntita[numeros[2]-1] = r1;
        preguntita[numeros[0]-1] = r2;
        preguntita[numeros[1]-1] = r3;
	}
	
	public void mostrarRespuestas() {
		System.out.println(this.pregunta);
		for (int i=0; i<preguntita.length; i++) {
			preguntita[i].setNumero(i);
			preguntita[i].mostrar();
		}
	}
	
	public Respuesta[] getArray() {
		return this.preguntita;
	}
	
	public static ArrayList<Pregunta> getArray2() {
		return preguntas;
	}
}