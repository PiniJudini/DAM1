package RA9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio1 {

	public static void main(String[] args) {
		String server = "jdbc:mysql://localhost:3306/naciones";
		String user = "gnome";
		String pswd = "1234";

		try (Connection conexion = DriverManager.getConnection(server, user, pswd)) {
			String pais = "Spain";
			listarLenguas(pais, conexion);
		} catch (SQLException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public static void listarLenguas(String pais, Connection conexion) throws SQLException {
		PreparedStatement sql = conexion.prepareStatement("SELECT country_id FROM countries WHERE name = ?",
				ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		sql.setString(1, pais);
		ResultSet resultado = sql.executeQuery();
		resultado.last();

		if (resultado.getRow() == 0)
			System.out.println(pais + " no es un país real o no está dado de alta en la base de datos");
		else {
			resultado.first();
			int codigoPais = resultado.getInt(1);
			PreparedStatement sql2 = conexion.prepareStatement(
					"SELECT language FROM country_languages JOIN languages USING (language_id) WHERE official = 1 AND country_id = ?",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			sql2.setInt(1, codigoPais);
			ResultSet resultado2 = sql2.executeQuery();
			resultado2.last();

			if (resultado2.getRow() == 0)
				System.out.println("No hay idioma oficial en " + pais);
			else {
				int filaFinal = resultado2.getRow();
				resultado2.beforeFirst();
				String cadena = "Idioma oficial en " + pais + ": ";

				while (resultado2.next()) {
					if (resultado2.getRow() != filaFinal)
						cadena += resultado2.getString(1) + ", ";
					else
						cadena += resultado2.getString(1);
				}

				System.out.println(cadena);
			}

			PreparedStatement sql3 = conexion.prepareStatement(
					"SELECT language FROM country_languages JOIN languages USING (language_id) WHERE official = 0 AND country_id = ?",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			sql3.setInt(1, codigoPais);
			ResultSet resultado3 = sql3.executeQuery();
			resultado3.last();

			if (resultado3.getRow() == 0)
				System.out.println("No hay otros idiomas");
			else {
				int filaFinal = resultado3.getRow();
				resultado3.beforeFirst();
				String cadena = "Otros idiomas: ";

				while (resultado3.next()) {
					if (resultado3.getRow() != filaFinal)
						cadena += resultado3.getString(1) + ", ";
					else
						cadena += resultado3.getString(1);
				}

				System.out.println(cadena);
			}
		}
	}
}