package fiap.scj.restful.ws.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/echo")
public class EchoResources {

	@GET
	public Response getEcho(@QueryParam("message") String message) {
		return Response.ok("echo " + message).build();
	}
	
	
}
