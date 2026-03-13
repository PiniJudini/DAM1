package Boletin18;

public class Main {
	public static void main(String[] args) {
		Personaje avatar = new Personaje("Eustaquio");
		Personaje avatar2 = new Personaje("Andrés");
		
		Accesorio item1 = new Accesorio("Pala de madera", 33);
		Accesorio item2 = new Accesorio("Pala de piedra", 66);
		Accesorio item3 = new Accesorio("Pala de cobre", 99);
		Accesorio item4 = new Accesorio("Pala de hierro", 130);
		Accesorio item5 = new Accesorio("Pala de oro", 200);
		Accesorio item6 = new Accesorio("Pala de diamante", 400);
		Accesorio item7 = new Accesorio("Pala de nederhita", 550);
		Accesorio item8 = new Accesorio("Azada de madera", 1500);
		Accesorio item9 = new Accesorio("Azada de oro", 225);
		Accesorio item10 = new Accesorio("Azada de esmeralda", 200);
		
		avatar.setAccesorio(item1);
		avatar.setAccesorio(item2);
		avatar.setAccesorio(item3);
		avatar.setAccesorio(item4);
		avatar.setAccesorio(item5);
		avatar.setAccesorio(item6);
		avatar.setAccesorio(item7);
		avatar.setAccesorio(item8);
		avatar.setAccesorio(item9);
		avatar.setAccesorio(item10);
		
		avatar.eliminarAccesorio(item10);
		avatar2.setAccesorio(item10);
	}
}
