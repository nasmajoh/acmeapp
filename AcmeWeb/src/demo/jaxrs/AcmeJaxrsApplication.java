package demo.jaxrs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;
//import com.ibm.websphere.server.IBMRestServlet;

import demo.jaxrs.services.AcmeServiceRS;

public class AcmeJaxrsApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(AcmeServiceRS.class);
		return classes;
		
	}
}
