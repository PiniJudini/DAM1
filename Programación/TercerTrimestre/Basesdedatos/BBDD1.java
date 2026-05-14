package Basesdedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BBDD1 {

	public static void main(String[] args) {
		String usuario = "admin";
		String password = "1234";
		String server = "jdbc:mysql://localhost:3306/sakila";

		try {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduce el nombre a buscar: ");
			String nombre = teclado.nextLine();
			System.out.println("Y el apellido porfi =) ");
			String apellido = teclado.nextLine();
			
			Connection conexion;
			conexion = DriverManager.getConnection(server, usuario, password);
			System.out.println("Hola BD =)");

			// TYPE_FORWARD_ONLY, TYPE_SCROLL_INSENSITIVE, TYPE_SCROLL_SENSITIVE
			// CONCUR_READ_ONLY
			Statement sql = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			// String consulta = "SELECT * FROM actor WHERE first_name = 'MARY'";
			// ResultSet resultado = sql.executeQuery(consulta);
			// .absolute(n) te pone en el registro de la base de datos con el numero n.
			
			PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM actor WHERE first_name = ? AND last_name = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			consulta.setString(1, nombre);
			consulta.setString(2, apellido);
			ResultSet resultado = consulta.executeQuery();
			resultado.last();
			System.out.println("Hay " + resultado.getRow() + " usuarios con ese nombre.");
			/* resultado.absolute(67);
	
	
			resultado.updateString("first_name", "Inés");
			resultado.updateString("last_name", "Perado");
			resultado.updateRow();
			*/
			
			resultado.afterLast();
			// Funciona si la query no está vacía.
			// El .next() es como un cursor de RAF.
			while (resultado.previous() == true) {
				// El .getDato() se puede poner para obtener el dato por el nombre de la columna
				// o el número de la posición de la tabla
				System.out.printf("Actor: %d %s \n", resultado.getInt(1), resultado.getString(2));

			}
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}

/*
 * COMANDOS .previous() para cursear al anterior. .first() para cursear al
 * inicio. .last() para cursear al final. .getrow() para obtener la fila en la
 * que estas.
 */
