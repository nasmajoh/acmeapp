package demo.jaxrs.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/services")
public class AcmeServiceRS {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getString() {
		return Response.ok("Hello from acme RS services!!").build();
	}
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postString(String msg) {
		return Response.ok("Hello, " + msg + " from acme RS services!!").build();
	}
	
	
}
