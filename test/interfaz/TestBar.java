package interfaz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dominio.Bar;
import dominio.Persona;

public class TestBar {

	@Test
	public void queNoSeAdmitanDuplicados() {
		Bar barcito = new Bar();
		Persona persona1 = new Persona("Juanchis");
		Persona persona2 = new Persona("Juanchis");
		barcito.agregarCliente(persona1);
		barcito.agregarCliente(persona2);
		Integer valorEsperado = 1;
		Integer valorObtenido = barcito.obtenerCantidadDeClientes();
		assertEquals(valorEsperado, valorObtenido);
		//assertEquals(1, barcito.obtenerCantidadDeClientes());
		
	}
	
	@Test 
	public void queSeAdmitanDistintos() {
		Bar barcote = new Bar();
		Persona p1 = new Persona("Marta");
		Persona p2 = new Persona("Agustin");
		barcote.agregarCliente(p1);
		barcote.agregarCliente(p2);
		Integer valorEsperado = 2;
		assertEquals(valorEsperado, barcote.obtenerCantidadDeClientes());
	}
	
	@Test
	public void queEstenOrdenados() {
		
	}
	
}
