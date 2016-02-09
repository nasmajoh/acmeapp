package demo.managedbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Demo cdi injection
 * test at http://localhost:9080/AcmeWeb/faces/cdiExample.xhtml
 * @author nasmajoh
 *
 */
@RequestScoped
@Named("acmeCdiBean")
public class AcmeCdiExampleBean {

	private @Inject
	AcmeInjectedBean injectedBean;
	
	public String getMessage() {
		if (injectedBean != null) {
			return injectedBean.getHello();
		}
		
		return "Something went wrong! The bean was not injected.";
	}
}
