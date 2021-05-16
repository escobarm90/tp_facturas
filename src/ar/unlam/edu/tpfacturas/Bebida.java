package ar.unlam.edu.tpfacturas;

public class Bebida extends Articulo {

	private String descripcion;
	private Double precio;
	private final Double IMPUESTO = 0.15;
	
	public Bebida(String descripcion, Double precio) {
		super(descripcion,precio);		
	}

	public String getDescripcion() {
		return this.descripcion;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public Double getImpuestoBebida() {
		return this.precio*IMPUESTO;
	}
	
	@Override
	public Double getPrecioConImpuesto() {
		return this.precio + this.getImpuestoBebida() + super.getImpuestoArticulo();
	}
}