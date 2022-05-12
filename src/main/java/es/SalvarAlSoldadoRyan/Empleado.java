package es.SalvarAlSoldadoRyan;

public class Empleado {

	private String nombre;
	private String ciudad;
	private String email;

	public String getNombre() {
		return nombre;
	}
	
	public String getCiudad() {
		return ciudad;
	}

	public String getEmail() {
		return email;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Empleado() {
	}

	public Empleado(String nombre, String ciudad, String email) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.email = email;

	}

}
