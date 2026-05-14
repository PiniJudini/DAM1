package Basesdedatos;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class Login {

	public static void main(String[] args) {
		String password = "abc123";

		// Generar Salt

		String salt = generarSalt();
		
		String passwordConSalt = salt + password;
		System.out.println(passwordConSalt);
		
		String hash = generarHash(salt + password);
		System.out.println("Hash: " + hash);
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
