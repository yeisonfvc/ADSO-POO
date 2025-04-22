package modeloVistaControlador;

public class Controlador {
	
	private RegistrarCliente objFormulario_registro;
	
	private Cliente objModelo_cliente;
	
	
	public Controlador( Cliente objeCliente , RegistrarCliente objRegistrarCliente ) {
		this.objModelo_cliente = objeCliente;
		this.objFormulario_registro = objRegistrarCliente;
	}
	
	public void iniciarFormulario() {
		
		int opcion = 0;
		do {
			
			opcion = this.objFormulario_registro.mostrarMenu();
			
			switch (opcion) {
			case 1:
				String auxNombre= this.objFormulario_registro.tomarRegistro_cliente();
				this.objModelo_cliente.guardarCliente(auxNombre);
				
				break;
				
			case 2:
				this.objModelo_cliente.imprimirClientes();
				break;
				
			case 3: 
				System.out.println("Saliendo del sistema");
				break;

			default:
				System.out.println("Opcion no valida");
				break;
			}
			
			
		}while(true);
		
	}

}
