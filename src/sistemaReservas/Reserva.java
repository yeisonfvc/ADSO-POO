package sistemaReservas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Reserva {
	
	private static List<Sala> salas  = new ArrayList<Sala>();;
	
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static void main( String args[] ) {
		
		crearSalas();
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Bienvenido a CINEMAX");
			System.out.println("Seleccione alguna de las siguientes opciones");
			System.out.println("1. Ver salas disponibles ");
			System.out.println("2. Registrarse ");
			System.out.println("3. Ver usuarios");
			System.out.println("4. Reservar");
			System.out.println("5. Salir");
			
			int opcion = scanner.nextInt();
			scanner.nextLine();
			
			
			switch (opcion) {
			case 1:
				
				
				for(int i=0; i< salas.size(); i++ ) {
					System.out.println(i+1 + ". " + salas.get(i).getTitulo() );
				}
				
				int sala = scanner.nextInt();
				
				break;
				
			case 2:
				
				registrarUsuario(scanner);
				
				break;
				
			case 3:
					verUsuarios();
				break;
				
			
			case 4:
				reservar(scanner);
			break;

			default:
				break;
			}
			
			
			
		}while(true);
		
	}
	
	
	public static void crearSalas() {
		
		
		
		for( int i = 0; i<= 5; i++) {
			Sala sala = new Sala();
			sala.setId(i+1);
			sala.setTitulo("Sala " + (i+1) );
			
			List<Asiento> asientos = new ArrayList<Asiento>();
			
			for(int j=0; j<=10; j++) {
				Asiento asiento = new Asiento();
				asiento.setId(j+1);
				asientos.add(asiento);
			}
			sala.setAsientos(asientos);
			
			salas.add(sala);
		}
		
	}
	

	public static void registrarUsuario(Scanner scanner) {
		
		System.out.println("Ingresa tu nombre");
		String nombre = scanner.nextLine();
		//scanner.nextLine();
		
		System.out.println("Ingresa tu cedula");
		String cedula = scanner.nextLine();
		
		Usuario usuario = new Usuario(nombre, cedula);
		
		usuarios.add(usuario);
		
		System.out.println("Registro exitoso!!!");
		
	}
	
	public static  void reservar( Scanner scanner ) {
		
		mostrarSalas();
		
		System.out.println("Ingresa el numero de sala por favor ");
		int sala = scanner.nextInt();
		
		
		
		for (int i = 0; i < salas.get(sala).getAsientos().size(); i++) { 
		    if (salas.get(sala).getAsientos().get(i).getUsuario() == null) {
		        System.out.println("Asiento " + (i + 1));
		    } else {
		        System.out.println("Asiento " + (i + 1) + " reservado");
		    }
		}		
		
		System.out.println("Seleccione el asiento por favor ");
		int asiento = scanner.nextInt();
		scanner.nextLine();
		
		
		
		System.out.println("Ingresa tu numero de cedula por favor: ");
		String cedula = scanner.nextLine();
		
		Optional<Usuario> usuario = usuarios.stream().filter(u -> u.getCedula().equals(cedula)).findFirst();
		
		
		
		if( usuario.isPresent() ) {
			salas.get(sala).getAsientos().get(asiento -1).setUsuario(usuario.get());
		}else{
			System.out.println("Usuario no registrado");
		}
		
		
		
	}
	
	public static void mostrarSalas() {
		
		for(int i=0; i< salas.size(); i++ ) {
			System.out.println(i+1 + ". " + salas.get(i).getTitulo() );
		}
		
	}
	
	

	public static  void verUsuarios() {
		
		for( Usuario usuario : usuarios ) {
			System.out.println("Cedula: " + usuario.getCedula() + " Nombre: " + usuario.getNombre());
		}
	}

}
