package es.SalvarAlSoldadoRyan;

public class JardineriaImpl extends Servicio {

	public boolean materialPropio;

	public boolean isMaterialPropio() {
		return materialPropio;
	}

	public void setMaterialPropio(boolean materialPropio) {
		this.materialPropio = materialPropio;
	}

	public JardineriaImpl() {
	};

	public JardineriaImpl(String nombre, Float precioBase, boolean materialPropio) {
		super(nombre, precioBase);
		this.materialPropio = materialPropio;
	};


}
