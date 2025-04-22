package arreglos;



public class ArregloPersona {
	
	private static PersonaModelo[] listaClientes;
	
	public static void main(String args[]) {
		crearArregloEstatico();
		imprimirArregloStatico();
		
	}
	
	public static void crearArregloEstatico() {
		ArregloPersona.listaClientes = new PersonaModelo[3];
		
		ArregloPersona.listaClientes[0] = new PersonaModelo("Json", "Cow", 18);
		ArregloPersona.listaClientes[1] = new PersonaModelo("Alejandra", "Aranda", 23);
		ArregloPersona.listaClientes[2] = new PersonaModelo("Paola", "Villamizar", 19);
		
		System.out.println("Se lleno el array con exito");
	}
	
	public static void imprimirArregloStatico() {
		
		for( int i = 0; i< listaClientes.length; i++ ) {
			listaClientes[i].imprimirDatos();
		}
	}

}
