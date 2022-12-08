package application.model;

import java.time.LocalDate;

public class Administrador extends Usuario{
	
	private String claveAcceso;

	public Administrador(String emailUsuario, String nombre, String apellido, int telefono, String domicilio,String sexo, LocalDate fechaEntrada, String claveAcceso) {
		super(emailUsuario, nombre, apellido, telefono, domicilio, sexo, fechaEntrada);
		this.claveAcceso = claveAcceso;
	}

	public String getClaveAcceso() {
		return claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}
	
	
	
	

}
