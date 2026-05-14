package Examen6_Turno2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio2 {

	public static void main(String[] args) {
		String usuario = "admin";
		String password = "1234";
		String server = "jdbc:mysql://localhost:3306/classicmodels";

		try (Connection conexion = DriverManager.getConnection(server, usuario, password)) {
			String ciudad1 = "Tokyo";
			String ciudad2 = "Paris";

			moverEmpleados(ciudad1, ciudad2, conexion);
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void moverEmpleados(String ciudad1, String ciudad2, Connection conexion) throws SQLException {
		PreparedStatement consulta = conexion.prepareStatement(
				"SELECT lastName, firstName, email FROM employees JOIN offices USING (officeCode) WHERE city = ?",
				ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		consulta.setString(1, ciudad1);

		ResultSet resultado = consulta.executeQuery();

		resultado.last();

		if (resultado.getRow() == 0)
			System.out.println("La oficina de " + ciudad1 + " no tiene empleados");
		else {
			System.out.println("Moviendo todos los empleados de " + ciudad1 + " a " + ciudad2);
			System.out.println("Se van a mover " + resultado.getRow() + " empleados de " + ciudad1 + " a " + ciudad2);

			String consulta2 = "UPDATE employees JOIN offices USING (officeCode) SET officeCode = (SELECT officeCode FROM offices WHERE city = ?) WHERE city = ?";
			PreparedStatement sql2 = conexion.prepareStatement(consulta2);

			sql2.setString(1, ciudad2);
			sql2.setString(2, ciudad1);

			sql2.executeUpdate();

			PreparedStatement consulta3 = conexion.prepareStatement(
					"SELECT lastName, firstName, email FROM employees JOIN offices USING (officeCode) WHERE city = ?",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			consulta3.setString(1, ciudad2);

			ResultSet resultado2 = consulta3.executeQuery();

			resultado2.last();
			System.out.println("La oficina de " + ciudad2 + " tiene ahora " + resultado2.getRow() + " empleados");
		}
	}
}
