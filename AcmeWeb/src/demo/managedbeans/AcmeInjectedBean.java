package demo.managedbeans;

import javax.enterprise.context.RequestScoped;

/**
 * Bean class to to demo the cdi injection
 * @author nasmajoh
 *
 */
@RequestScoped
public class AcmeInjectedBean {

	public String getHello() {
		return "Hello from injected bean";
	}
}
