package application.model;

import java.time.LocalDate;

public class Medico extends Usuario {
	
	private String especialidad;
	
	public Medico(String emailUsuario, String nombre, String apellido, int telefono, String domicilio, String sexo, LocalDate fechaEntrada, String especialidad) {
		super(emailUsuario, nombre, apellido, telefono, domicilio, sexo, fechaEntrada);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
