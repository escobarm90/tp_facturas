package ar.unlam.edu.tpfacturas;

public class Articulo {

	protected String descripcion;
	protected Double precio;
	protected final Double IMPUESTO = 0.21;
	
	public Articulo(String descripcion, Double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public Double getPrecio() {
		return this.precio;
	}
	
	public Double getImpuesto() {
		return this.precio*IMPUESTO;
	}
	
	public Double getPrecioConImpuesto() {
		return this.precio + getImpuesto();
	}
	
	
}
