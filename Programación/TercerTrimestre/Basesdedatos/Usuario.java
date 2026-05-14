package Basesdedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String salt;
	private String hash;
	private String email;
	private int privilegios = 1;

	private static ArrayList<Usuario> usuarios = new ArrayList<>();

	public Usuario(String n, String s, String h, String e, int p) {
		this.nombre = n;
		this.salt = s;
		this.hash = h;
		this.email = e;
		this.privilegios = p;
		usuarios.add(this);
	}

	public static void leerBBDD(String server, String usuario, String password) {
		try (Connection conexion = DriverManager.getConnection(server, usuario, password)) {

			Statement sql = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM registros",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet resultado = consulta.executeQuery();
			resultado.last();

			if (resultado.getRow() == 0)
				System.out.println("Está vacía");
			else {
				resultado.beforeFirst();
				while (resultado.next() == true) {
					Usuario user = new Usuario(resultado.getString(1), resultado.getString(3), resultado.getString(4),
							resultado.getString(2), resultado.getInt(5));
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static ArrayList<Usuario> getArray() {
		return usuarios;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getEmail() {
		return this.email;
	}

	public String getSalt() {
		return this.salt;
	}

	public String getHash() {
		return this.hash;
	}

	public static void añadirUser(String user, String salt, String hash, String email) {
		String usuario = "admin";
		String password = "1234";
		String server = "jdbc:mysql://localhost:3306/registros";

		Usuario usuario1 = new Usuario(user, salt, hash, email, 1);
		try (Connection conexion = DriverManager.getConnection(server, usuario, password)) {
			PreparedStatement query = conexion.prepareStatement("INSERT INTO registros VALUES (?, ?, ?, ?, ?)");

			query.setString(1, user);
			query.setString(2, email);
			query.setString(3, salt);
			query.setString(4, hash);
			query.setInt(5, 1);

			query.executeUpdate();
		} catch (Exception e) {

		}
	}
}
