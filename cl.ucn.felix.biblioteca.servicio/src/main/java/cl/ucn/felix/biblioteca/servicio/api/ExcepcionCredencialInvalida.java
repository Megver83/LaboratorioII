package cl.ucn.felix.biblioteca.servicio.api;

public class ExcepcionCredencialInvalida extends Exception{

	private static final long serialVersionUID = 1L;

	public ExcepcionCredencialInvalida(String username) {
		super("El usuario o la contraseña no son válidos");
	}
	
	
}
