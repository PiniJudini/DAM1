package Boletin26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ejercicio3 {
	public static void main(String[] args) {
		stockInferior(10);
	}

	public static void stockInferior(int numero) {
		String usuario = "admin";
		String password = "1234";
		String server = "jdbc:mysql://localhost:3306/classicmodels";
		try (Connection conexion = DriverManager.getConnection(server, usuario, password)) {
			PreparedStatement consulta = conexion.prepareStatement(
					"SELECT products.productCode,quantityInStock,COUNT(orderNumber) FROM products JOIN orderdetails USING(productCode) WHERE products.quantityInStock <= ? GROUP BY products.productCode",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			consulta.setInt(1, numero);
			consulta.executeQuery();

			ResultSet resultado = consulta.executeQuery();
			resultado.last();
			if (resultado.getRow() == 0) {
				System.out.println("No tienes productos que cumplan las condiciones.");
			} else {
				resultado.beforeFirst();
				System.out.println("Los productos son los siguientes: ");
				while (resultado.next() == true) {
					System.out.println(resultado.getString(1) + " " + resultado.getInt(2) + " " + resultado.getInt(3));
				}
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
