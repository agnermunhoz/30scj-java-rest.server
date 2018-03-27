package fiap.scj.restful.ws.resources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fiap.scj.restful.ws.resources.bean.Message;

@Path("/echo")
public class EchoResources {

	@GET
	public Response getEcho(@QueryParam("message") String message) {
		return Response.ok("echo " + message).build();
	}
	
	@Path("/list")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Message> getMessages() {
		Message m1 = new Message();
		m1.setText("message 1");
		m1.setDataCreation(new Date());
		
		Message m2 = new Message();
		m2.setText("message 2");
		m2.setDataCreation(new Date());
		
		List<Message> retorno = new ArrayList<Message>();
		retorno.add(m1);
		retorno.add(m2);
		
		return retorno;
	}	
	
}
