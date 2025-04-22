package modeloVistaControlador;

import java.util.Scanner;

public class RegistrarCliente {
	
	
	
	public int mostrarMenu() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Registrar cliente ");
		System.out.println("2. Ver lista de clientes ");
		System.out.println("3. Salir");
		int opcion = scanner.nextInt();
		
		return opcion;
	}
	
	
	public String tomarRegistro_cliente() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("***Bienvenidos al registro de clientes*** ");
		System.out.println("Digite el nombre del cliente");
		String nombre = scanner.nextLine();
		
		System.out.println("Digite el apellido");
		String apellido = scanner.nextLine();
		
		System.out.println("Digite la cedula");
		String cedula =  scanner.nextLine();	
		
		
		
		return nombre;
	}

}
