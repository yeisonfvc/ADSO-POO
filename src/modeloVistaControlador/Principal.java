package modeloVistaControlador;

public class Principal {
	
	public static void main(String args[]) {
		
		Cliente cliente = new Cliente();
		RegistrarCliente objFormulario = new RegistrarCliente();
		
		Controlador controlador = new Controlador(cliente, objFormulario);
		
		controlador.iniciarFormulario();
	}

}
