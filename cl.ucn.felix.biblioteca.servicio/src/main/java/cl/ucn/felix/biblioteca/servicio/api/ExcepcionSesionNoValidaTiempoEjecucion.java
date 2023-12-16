package cl.ucn.felix.biblioteca.servicio.api;

public class ExcepcionSesionNoValidaTiempoEjecucion extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ExcepcionSesionNoValidaTiempoEjecucion(String sesion) {
		super("Ocurrió un error durante el en tiempo de ejecucion");
	}
}
