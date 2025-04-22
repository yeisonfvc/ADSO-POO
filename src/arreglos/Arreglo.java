package arreglos;

public class Arreglo {
	
	private static String[] listaNombresClientes;
	
	public static void main(String args[]) {
		
		Arreglo.crearArregloEstatico();
		Arreglo.imprimirArregloEstatico();
	}
	
	
	public static void crearArregloEstatico() {
		Arreglo.listaNombresClientes = new String[3];
		
		Arreglo.listaNombresClientes[0] = "Paola";
		Arreglo.listaNombresClientes[1] = "Camila";
		Arreglo.listaNombresClientes[2] = "Yeison";
		
		System.out.println("Se creo el array con exito");
	}
	
	public static void imprimirArregloEstatico() {
		for(int i= 0; i< Arreglo.listaNombresClientes.length; i++) {
			System.out.println((i+1) + ". El nombre del cliente es " + Arreglo.listaNombresClientes[i]);
		}
	}

}
