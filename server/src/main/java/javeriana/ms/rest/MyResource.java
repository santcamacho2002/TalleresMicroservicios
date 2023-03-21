package javeriana.ms.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myapp")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    //http://localhost:8080/myapp/hello?name=Santiago
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam("name") String name){
        return "Hello "+name;
    }

    //http://localhost:8080/myapp/punto2/2
    @GET
    @Path("/punto2/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String punto2(@PathParam("id") String id){
        return "Usuario "+id;
    }

    //http://localhost:8080/myapp/user?name=Carlos
    @GET
    @Path("user")
    @Produces(MediaType.TEXT_PLAIN)
    public String punto3(@QueryParam("user") String user){

        return "<html>" +
                "<head><title>REST SERVER</title></head>" +
                "<body><p> Hello: " + user + "</p></body>" +
                "</html>";
    }

    //http://localhost:8080/myapp/multiplicacion/5?mult1=4
    @GET
    @Path("multiplicacion/{mult2}")
    public String multiplicacion(@QueryParam("mult1") int mult1,@PathParam("mult2")String mult2){
        double result = mult1*Double.valueOf(mult2);
        return String.valueOf(result);
    }

    //http://localhost:8080/myapp/viaje
    @GET
    @Path("viaje")
    @Produces(MediaType.APPLICATION_XML)
    public Paseo paseo(){
        return new Paseo("Quito","Bogota",500000);
    }
}
