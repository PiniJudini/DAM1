package Examen6_Turno2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio1 {

	public static void main(String[] args) {
		String usuario = "admin";
		String password = "1234";
		String server = "jdbc:mysql://localhost:3306/classicmodels";

		try (Connection conexion = DriverManager.getConnection(server, usuario, password)) {
			String ciudad = "Paris";
			
			listarEmpleados(ciudad, conexion);
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void listarEmpleados(String ciudad, Connection conexion) throws SQLException {
		PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM offices WHERE city = ?",
				ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		consulta.setString(1, ciudad);
		ResultSet resultado = consulta.executeQuery();

		resultado.last();
		if (resultado.getRow() == 0)
			System.out.println("No existe oficina en " + ciudad);
		else {
			PreparedStatement consulta2 = conexion.prepareStatement(
					"SELECT lastName, firstName, email FROM employees JOIN offices USING (officeCode) WHERE city = ?",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			consulta2.setString(1, ciudad);
			ResultSet resultado2 = consulta2.executeQuery();

			resultado2.last();
			if (resultado2.getRow() == 0)
				System.out.println("La oficina de " + ciudad + " no tiene empleados");
			else {
				System.out.println(
						"Hay " + resultado2.getRow() + " empleados en la oficina de " + ciudad + ". Sus datos son:");

				resultado2.beforeFirst();

				while (resultado2.next()) {
					System.out.println(resultado2.getString(1) + ", " + resultado2.getString(2) + " ("
							+ resultado2.getString(3) + ")");
				}
			}
		}
	}
}
