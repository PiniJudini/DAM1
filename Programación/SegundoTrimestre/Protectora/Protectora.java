package Protectora;

public class Protectora {
	private Gato[] gatos = new Gato[3]; 
	private Perro[] perros = new Perro[2];
	private Tortuga[] tortuga = new Tortuga[1];
	private int contador = 1;
	private String nombreP;
	private Animal animal;
	private Animal[] animales = new Animal[contador];
	
	public Protectora(String nombreP) {
		this.nombreP = nombreP;
	}
	
	public void nuevoProtected(Animal animal) {
		int contadorIguales = 0;
		for(int i=0; i<contador; i++) {
			for (int j=0; j<animales.length; j++) {
				if(animales[i]==animales[j] && animales[i]!=null)
					contadorIguales++;
			}
			if(contadorIguales==0)
				animales[i]=animal;
		}
		this.contador++;
	}
	
	public void mostrarProtectora() {
		for(int i=0; i<animales.length; i++)
			System.out.println(animales[i]);
	}
	
}
