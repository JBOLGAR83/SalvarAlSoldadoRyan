package es.SalvarAlSoldadoRyan;

public class GeriatriaImpl extends Servicio {

	private int añosExperiencia;
	private String titulacion;

	public int getAñosExperiencia() {
		return añosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		this.añosExperiencia = añosExperiencia;

	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;

	}

	public GeriatriaImpl() {
	};

	public GeriatriaImpl(String nombre, Float precioBase, int añosExperiencia, String titulacion) {
		super(nombre, precioBase);
		this.añosExperiencia = añosExperiencia;
		this.titulacion = titulacion;
	};

}
