package arreglos;

public class PersonaModelo {
	
	private String nombrePersona;
	
	private String apellidoPersona;
	
	private int edadPersona;
	
	public PersonaModelo( String nombre, String apellido, int edad ) {
		nombrePersona = nombre;
		apellidoPersona = apellido;
		edadPersona = edad;
	}
	
	public void imprimirDatos() {
		System.out.println("Nombre: " + nombrePersona);
		System.out.println("Apellido: " + apellidoPersona);
		System.out.println("Edad: " + edadPersona);
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getApellidoPersona() {
		return apellidoPersona;
	}

	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}

	public int getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}
	
	

}
