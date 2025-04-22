package modeloVistaControlador;

public class Cliente {
	
	private String nombreCliente;
	private String[] listaClientes;
	
	private int contador;
	
	public Cliente( ) {
		this.nombreCliente = "";
		this.contador = 0;
		this.listaClientes = new String[3];
	}
	
	
	public void guardarCliente( String datoNombre ) {
		if( this.contador < listaClientes.length) {
			this.listaClientes[this.contador]= datoNombre;
			this.contador++;
			System.out.println("informacion guardada");
		}
	}
	
	
	public void imprimirClientes() {
		for(int i=0; i< this.listaClientes.length; i++) {
			System.out.println("XXX" + this.listaClientes[i]);
		}
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String[] getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(String[] listaClientes) {
		this.listaClientes = listaClientes;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	
	
	

}
