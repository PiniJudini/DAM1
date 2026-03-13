package EmpresaReparto;

public class Ubicacion {
	private int x;
	private int y;
	
	public Ubicacion(int x2, int y2) {
		this.x = x2;
		this.y = y2;
	}
	
	public int obtenerX() {
		return this.x;
	}
	
	public int obtenerY() {
		return this.y;
	}
}
