package Basesdedatos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BBDD2 {

	public static void main(String[] args) {
		String usuario = "admin";
		String password = "1234";
		String server = "jdbc:mysql://localhost:3306/sakila";

		try (Connection conexion = DriverManager.getConnection(server, usuario, password)) {
			System.out.println("Conexion realizada con exito.");
			Statement consulta = conexion.createStatement();
			ResultSet resultado = consulta.executeQuery("SELECT * FROM actor");
			
			/*System.out.println("------------------------------------");
			System.out.println("|  id |  first_name |    last_name |");
			System.out.println("------------------------------------");
			while(resultado.next() == true)
				System.out.printf("| %3d | %11s | %12s | \n", resultado.getInt(1), resultado.getString(2), resultado.getString(3));
			System.out.println("------------------------------------");*/
			
			JFrame ventana = new JFrame("Tabla actor");
			
			DefaultTableModel modelo = new DefaultTableModel();
			JTable tabla = new JTable(modelo);
			
			modelo.addColumn("id");
			modelo.addColumn("first_name");
			modelo.addColumn("last_name");
			
			JScrollPane scroll = new JScrollPane(tabla);
			ventana.getContentPane().add(scroll);
			
			while(resultado.next() == true) {
				Object[] fila = new Object[3];
				fila[0] = resultado.getInt(1);
				fila[1] = resultado.getString(2);
				fila[2] = resultado.getString(3);
				
				modelo.addRow(fila);
			}
			
			ventana.pack();
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ventana.setVisible(true);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

/*	PreparedStatement query = conexion.prepareStatement("INSERT INTO actor VALUES (0, ?, ?, ?)");

	LocalDateTime fechayhora = LocalDateTime.now();
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss");
	String fecha = fechayhora.format(formato);

	query.setString(1, "Pinipon");
	query.setString(2, "Action");
	query.setString(3, fecha);

	query = conexion.prepareStatement("DELETE FROM actor WHERE last_name = 'Action'");
	// El query.executeUpdate() devuelve 1 si se ha realizado y un 0 si no.
	query.executeUpdate();*/

/*	String consulta1 = "CREATE DATABASE IF NOT EXISTS agenda";
	String consulta2 = "USE agenda";
	String consulta3 = "CREATE TABLE IF NOT EXISTS personas(telefono INT(9) PRIMARY KEY, nombre VARCHAR(50))";
	
	Statement consulta = conexion.createStatement();
	
	consulta.executeUpdate(consulta1);
	consulta.executeUpdate(consulta2);
	consulta.executeUpdate(consulta3);*/

