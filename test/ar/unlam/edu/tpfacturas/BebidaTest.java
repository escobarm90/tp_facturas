package ar.unlam.edu.tpfacturas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BebidaTest {

	@Test
	public void queSePuedaCrearUnaBebida() {
		Bebida nueva = new Bebida("Fernet", 100.0);

		assertNotNull(nueva);

	}
	
	@Test
	public void queUnaBebidaInformeSuPrecioSinImpuesto(){		
		Bebida nueva = new Bebida("Fernet", 100.0);
		
			
		assertEquals(100.0, nueva.getPrecio(),0.1);
		
	}
	
	@Test
	public void queUnaBebidaInformeSuImpuesto() {
		Bebida nueva = new Bebida("Fernet", 100.0);
		
		assertEquals(nueva.getImpuesto(),15.0,0.1);
	}
	
	@Test
	public void queUnaBebidaInformeSuPrecioConImpuesto() {
		Bebida nueva = new Bebida("Fernet", 100.0);
		
		assertEquals(nueva.getPrecioConImpuesto(),121.0,0.1);
	}
	
	
	
	@Test
	public void queUnArticuloInformeSuDescripcion(){
		Bebida nueva = new Bebida("Fernet", 100.0);
		
		assertEquals("Fernet",nueva.getDescripcion());
	}
}
