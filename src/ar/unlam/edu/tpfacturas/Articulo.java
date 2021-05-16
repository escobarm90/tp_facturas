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
		return descripcion;
	}

	public Double getPrecio() {
		return precio;
	}
	
	public Double getImpuestoArticulo() {
		return precio*IMPUESTO;
	}
	
	public Double getPrecioConImpuesto() {
		return precio + getImpuestoArticulo();
	}
	
	
}
