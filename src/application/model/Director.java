package application.model;

import java.time.LocalDate;

public class Director extends Usuario{

	public Director(String emailUsuario, String nombre, String apellido, int telefono, String domicilio, String sexo, LocalDate fechaEntrada) {
		super(emailUsuario, nombre, apellido, telefono, domicilio, sexo, fechaEntrada);
	}
	
	
	

}
