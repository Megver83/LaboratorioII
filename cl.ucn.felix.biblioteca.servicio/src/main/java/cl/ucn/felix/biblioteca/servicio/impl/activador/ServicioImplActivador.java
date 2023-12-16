package cl.ucn.felix.biblioteca.servicio.impl.activador;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import cl.ucn.felix.biblioteca.servicio.api.ServicioInventarioLibro;

// Nuevas importaciones
import java.util.Hashtable;
import cl.ucn.felix.biblioteca.servicio.api.ServicioInventarioLibroImpl;

public class ServicioImplActivador  implements BundleActivator {

	ServiceRegistration<ServicioInventarioLibro> registro = null;
	
	@Override
	public void start(BundleContext context) throws Exception {
		ServicioInventarioLibro servicio = new ServicioInventarioLibroImpl(context);
		Hashtable<String, Object> p = new Hashtable<String, Object>();
		registro = (ServiceRegistration<ServicioInventarioLibro>) context.registerService(ServicioInventarioLibro.class.getName(),servicio, p);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		if(registro != null) registro.unregister();
	}

}
