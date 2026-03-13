package EjercicioBanco;

public class Main {
	public static void main(String[] args) {
		Banco banco1 = new Banco("ING","ES33 1233");
		Banco banco2 = new Banco("ING","ES33 1233");
		
		Sucursal madrid = new Sucursal(banco1,"Calle Capi Salami Salomón", 33, 28039, "Madrid",1742);
		Sucursal barcelona = new Sucursal(banco2,"Calle Dandi de la Barceló", 6, 33039, "Barcelona",2743);
		
		Cliente andres = new Cliente("Andrés","Ortega Cebriá","75783020A",645839291);
		Cliente pini = new Cliente("Marcos","Pineros Quero","03492765P",616312116);
		Cliente zishan = new Cliente("Zishan","Ali Asfaq","43959849P",648960939);
		
		Cuenta cuenta1 = new Cuenta(9218, barcelona, "111222333444");
		Cuenta cuenta2 = new Cuenta(3445, madrid, "555666777888");
		
		banco1.setSucursal(madrid);
		banco2.setSucursal(barcelona);
		banco1.mostrarSucursales();
		System.out.println();
		
		andres.setTitular(cuenta1);
		andres.setTitular(cuenta2);
		pini.setTitular(cuenta1);
		pini.setTitular(cuenta2);
		zishan.setTitular(cuenta2);
		System.out.println();
		
		madrid.añadirCliente(pini);
		madrid.añadirCliente(andres);
		madrid.mostrarClientes();
		System.out.println(" ");
		
		cuenta1.mostrarTitulares();
		cuenta1.mostrarIBAN();
		cuenta1.mostrar();
	}
}
