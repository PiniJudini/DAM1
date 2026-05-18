package Boletin27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		String usuario = "admin";
		String password = "1234";
		String server = "jdbc:mysql://localhost:3306/pokemondb";

		try (Connection conexion = DriverManager.getConnection(server, usuario, password)) {
			leerBBDD(conexion);

			Pokemon.mostrarPokemons();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void leerBBDD(Connection conexion) throws SQLException {
		Statement sql = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		String consulta = "SELECT * FROM pokemon";
		ResultSet resultado = sql.executeQuery(consulta);

		while (resultado.next()) {
			int codigo = resultado.getInt(1);
			String nombre = resultado.getString(2);
			double peso = resultado.getDouble(3);
			double altura = resultado.getDouble(4);

			PreparedStatement consulta2 = conexion.prepareStatement(
					"SELECT pokemon.nombre,tipo.nombre FROM pokemon JOIN pokemon_tipo USING(numero_pokedex) JOIN tipo USING (id_tipo) WHERE numero_pokedex = ?",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			consulta2.setInt(1, codigo);
			ResultSet resultado2 = consulta2.executeQuery();
			resultado2.last();

			if (resultado2.getRow() == 2) {
				resultado2.beforeFirst();

				resultado2.next();
				String tipo1 = resultado2.getString(2);

				resultado2.next();
				String tipo2 = resultado2.getString(2);
				Pokemon pokemon = new Pokemon(codigo, nombre, peso, altura, tipo1, tipo2);
			} else {
				resultado2.beforeFirst();

				resultado2.next();
				String tipo1 = resultado2.getString(2);

				Pokemon pokemon = new Pokemon(codigo, nombre, peso, altura, tipo1);
			}

		}
	}
}
