package org.test.jetty;
 
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
 
@Path("/demo/json")
public class EntryPoint {
	
	// API four
	// link: http://localhost:8180/demo/json/load
    @GET
    @Path("/load")
    @Produces(MediaType.APPLICATION_JSON)
    public Message test() {
    
    	Message meg = new Message();
    	meg.setTitle("To You");
    	meg.setContent("Hi dundun");
        return meg;

    }

	
	// API five
	// link: http://localhost:8180/demo/json/save
    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response test(Message meg) {
    
    	String result = "I got ur meg: " + meg.toString();
        return Response.status(200).entity(result).build();

    }
}
 