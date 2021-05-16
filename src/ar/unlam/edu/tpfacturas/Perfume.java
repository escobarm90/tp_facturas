package ar.unlam.edu.tpfacturas;

public class Perfume extends Articulo {

	private String descripcion;
	private Double precio;
	private final Double IMPUESTO = 0.15;
	
	public Perfume(String descripcion, Double precio) {
		super(descripcion,precio);		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Double getPrecio() {
		return precio;
	}
	
	public Double getImpuestoPerfume() {
		return precio*IMPUESTO;
	}
	
	@Override
	public Double getPrecioConImpuesto() {
		return precio + getImpuestoPerfume() + super.getImpuestoArticulo();
	}
}
