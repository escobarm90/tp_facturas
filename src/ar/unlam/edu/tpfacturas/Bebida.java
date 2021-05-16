package ar.unlam.edu.tpfacturas;

public class Bebida extends Articulo {

	private String descripcion = null;
	private Double precio = 0.0;
	private final Double IMPUESTOBEBIDA = 0.15;
	
	public Bebida(String descripcion, Double precio) {
		super(descripcion,precio);		
	}

	@Override
	public Double getImpuesto() {
		return super.precio*IMPUESTOBEBIDA;
	}
	
	@Override
	public Double getPrecioConImpuesto() {
		return super.precio + super.getImpuesto() + this.getImpuesto();
	}
}