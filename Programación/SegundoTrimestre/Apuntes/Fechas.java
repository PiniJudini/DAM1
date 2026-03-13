package DAM1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Fechas {
	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		System.out.println(hoy);
		LocalTime ahora = LocalTime.now();
		System.out.println(ahora);
		LocalDateTime fechayhora = LocalDateTime.now();
		
		//El comando plusHours(numeroHoras) añade a la hora actual el número de horas entre paréntesis. Lo mismo se aplica para el de Minutes, Seconds...
		ahora = ahora.plusHours(3);
		System.out.println("Dentro de tres horas: " + ahora);
		//El comando plusYears se aplica para LocalDate y añade la cantidad de años que le pongas entre paréntesis. Se aplica a Days, Months... 
		hoy = hoy.plusYears(1);
		System.out.println("Dentro de un año: " + hoy);
		
		//IMPORTANTE: poner las mayúsculas dentro del paréntesis del ofPattern si te salen cosas raras
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy");
		String fechaConFormato = fechayhora.format(formato);
		System.out.println(fechaConFormato);
		
		
	}
}
