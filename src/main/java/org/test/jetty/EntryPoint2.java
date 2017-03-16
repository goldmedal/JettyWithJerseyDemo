package org.test.jetty;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/demo")
public class EntryPoint2 {

	// API one
	// link: http://localhost:8180/demo/news
    @GET
    @Path("/news")
    @Produces(MediaType.TEXT_PLAIN)
    public Response test() {
        return Response.status(200).entity("All News...").build();
    }
    
    // API two
	// link: http://localhost:8180/demo/news/{var1}
    @GET
    @Path("/news/{var1}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response test1(
    		@PathParam("var1") String var1
    	) {
        return Response.status(200).entity("News " + var1 + " is ....").build();
    }

    // API three
	// link: http://localhost:8180/demo/add/{var1}/{var2}
    @GET
    @Path("/add/{var1}/{var2}")
    @Produces(MediaType.TEXT_PLAIN)
    public Response add(
    		@PathParam("var1") int var1,
    		@PathParam("var2") int var2
    	) {
    	int result = var1 + var2;
        return Response.status(200).entity("Result is " + result).build();
    }


}
 