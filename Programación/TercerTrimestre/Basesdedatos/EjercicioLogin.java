package Basesdedatos;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Base64;
import java.util.Scanner;

public class EjercicioLogin {
	public static void main(String[] args) {
		String usuario = "admin";
		String contraseña = "1234";
		String server = "jdbc:mysql://localhost:3306/";
		
		crearBBDD(server, usuario, contraseña);
		
		server += "registros";
		Usuario.leerBBDD(server, usuario, contraseña);

		int numero = verificarEntrada();

		if (numero == 1)
			iniciarSesion();
		else
			registrarse();

	}
	
	public static int verificarEntrada() {
		boolean valido = true;
		int numero = 0;

		do {
			try {
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("-------- MENÚ --------");
				System.out.println("| 1.  Iniciar Sesión |");
				System.out.println("| 2.     Registrarse |");
				System.out.println("----------------------");
				System.out.println("Introduce una opción: ");
				numero = teclado.nextInt();

				if (numero > 2 || numero < 1)
					valido = false;
				else
					valido = true;
			} catch (Exception e) {
				System.out.println("El dato introducido no es válido.");
				valido = false;
			}
		} while (valido == false);
		
		return numero;
	}

	public static void registrarse() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el usuario: ");
		String user = teclado.nextLine();

		System.out.println("Introduce el email: ");
		String email = teclado.nextLine();

		boolean esta = false;
		for (Usuario usuario : Usuario.getArray()) {
			if (usuario.getNombre().equals(user))
				esta = true;
			if (usuario.getEmail().equals(email))
				esta = true;
		}

		if (esta == true)
			System.out.println("El usuario ya está");
		else {
			System.out.println("Introduce la contraseña: ");
			String password = teclado.nextLine();

			System.out.println("Vuelve a introducir la contraseña: ");
			String password2 = teclado.nextLine();
			
			if(password.equals(password2)) {
				String salt = generarSalt();
				
				String hash = generarHash(salt + password);
				
				Usuario.añadirUser(user, salt, hash, email);
				
				System.out.println("Usuario añadido con exito");
			} else
				System.out.println("Las contraseñas no coinciden");
		}
	}

	public static void iniciarSesion() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el usuario o el correo: ");
		String entrada = teclado.nextLine();

		System.out.println("Introduce la contraseña: ");
		String password = teclado.nextLine();
		
		boolean esta = false;
		Usuario usuario1 = null;
		for(Usuario usuario: Usuario.getArray()) {
			if(usuario.getNombre().equals(entrada) || usuario.getEmail().equals(entrada))
				usuario1 = usuario;
		}
		
		String hash = generarHash(usuario1.getSalt() + password);
		if(hash.equals(usuario1.getHash()))
			System.out.println("Has entrado");
		else
			System.out.println("El usuario o la contraseña fallan");
	}

	public static void crearBBDD(String server, String usuario, String contraseña) {
		try (Connection conexion = DriverManager.getConnection(server, usuario, contraseña)) {
			String consulta1 = "CREATE DATABASE IF NOT EXISTS registros";
			String consulta2 = "USE registros";
			String consulta3 = "CREATE TABLE IF NOT EXISTS registros(usuario VARCHAR(50), email VARCHAR(50), salt VARCHAR(24), hash VARCHAR(88), privilegios TINYINT(1))";

			Statement consulta = conexion.createStatement();

			consulta.executeUpdate(consulta1);
			consulta.executeUpdate(consulta2);
			consulta.executeUpdate(consulta3);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static String generarSalt() {
		SecureRandom azar = new SecureRandom();
		byte[] salt = new byte[16];
		azar.nextBytes(salt);
		String saltTxt = Base64.getEncoder().encodeToString(salt);
		return saltTxt;
	}

	public static String generarHash(String txt) {
		String hashTxt = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-512");
			byte[] hash = digest.digest(txt.getBytes(StandardCharsets.UTF_8));
			hashTxt = Base64.getEncoder().encodeToString(hash);
		} catch (Exception e) {
			System.out.println("El algoritmo no existe.");
		}

		return hashTxt;
	}
}
