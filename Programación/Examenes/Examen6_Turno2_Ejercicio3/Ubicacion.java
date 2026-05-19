package Examen6_Turno2_Ejercicio3;

public interface Ubicacion {

	int compareTo(Carta carta);
	
	void setUbicacion(String string);
	
	void biblioteca();
	
	void mano();
	
	void cementerio();
}
