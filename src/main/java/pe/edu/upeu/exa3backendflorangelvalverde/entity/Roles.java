package pe.edu.upeu.exa3backendflorangelvalverde.entity;

public class Roles {
	private int idrol;
	private String nombre;
	public Roles() {
		super();
	}
	Roles(int idrol, String nombre) {
		super();
		this.idrol = idrol;
		this.nombre = nombre;
	}
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
