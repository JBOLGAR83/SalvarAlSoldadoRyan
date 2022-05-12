package es.SalvarAlSoldadoRyan;

public abstract class Servicio {

	private String nombre;
	private Float precioBase;

	public String getNombre() {
		return nombre;
	}

	public Float getPrecioBase() {
		return precioBase;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecioBase(Float precioBase) {
		this.precioBase = precioBase;
	}

	public Servicio() {
	}

	public Servicio(String nombre, Float precioBase) {
		this.nombre = nombre;
		this.precioBase = precioBase;
	}

}
