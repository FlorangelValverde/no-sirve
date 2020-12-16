package pe.edu.upeu.exa3backendflorangelvalverde.entity;

public class Personas {
	private int idpersona;
	private String nombres;
	private String dni;
	Personas() {
		super();
	}
	Personas(int idpersona, String nombres, String dni) {
		super();
		this.idpersona = idpersona;
		this.nombres = nombres;
		this.dni = dni;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
