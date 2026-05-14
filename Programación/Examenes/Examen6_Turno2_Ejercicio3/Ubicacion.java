package Examen6_Turno2_Ejercicio3;

public interface Ubicacion {

	int compareTo(Carta carta);
	
	void setUbicacion(String string);
	
	default void cementerio() {
		this.setUbicacion("Cementerio");
	}

	default void biblioteca() {
		this.setUbicacion("Biblioteca");
	}
	
	default void mano() {
		this.setUbicacion("Mano");
	}
}
