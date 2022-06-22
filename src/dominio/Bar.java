package dominio;

import java.util.Set;
import java.util.TreeSet;

public class Bar {
	
	private Set<Persona> clientes = new TreeSet<Persona>();

	public void agregarCliente(Persona cliente) {
		this.clientes.add(cliente);

	}

	public Integer obtenerCantidadDeClientes() {
		return this.clientes.size();
	}

}
