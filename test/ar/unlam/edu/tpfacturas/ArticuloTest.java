package ar.unlam.edu.tpfacturas;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArticuloTest {
	
	@Test
	public void queSePuedaCrearUnArticulo() {
		Articulo nuevo = new Articulo("comida", 100.0);

		assertNotNull(nuevo);

	}
	
	@Test
	public void queUnArticuloInformeSuPrecioSinImpuesto(){		
		Articulo nuevo = new Articulo("comida", 100.0);
		
		assertEquals(100.0, nuevo.getPrecio(),0.1);
		
	}
	
	@Test
	public void queUnArticuloInformeSuPrecioConImpuesto() {
		Articulo nuevo = new Articulo("comida", 100.0);
		
		assertEquals(nuevo.getPrecioConImpuesto(),121.0,0.1);
	}
	
	@Test
	public void queUnArticuloInformeSuImpuesto() {
		Articulo nuevo = new Articulo("comida", 100.0);
		
		assertEquals(nuevo.getImpuesto(),21.0,0.1);
	}
	
	@Test
	public void queUnArticuloInformeSuDescripcion(){
		Articulo nuevo = new Articulo("comida", 100.0);
		
		assertEquals("comida",nuevo.getDescripcion());
	}
	
	
	
}
