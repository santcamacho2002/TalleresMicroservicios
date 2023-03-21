package javeriana.ms.rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;

import static javeriana.ms.rest.ConstructorPaseo.paseos;

@Path("paseos")
public class PasesosResource {
    @GET
    @Path("/listPaseos")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Paseo> listarPaseos(){
        return paseos.paseos();
    }

    @POST
    @Path("/nuevoPaseo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String nuevoPaseo(Paseo paseo){
        if(paseos.nuevoPaseo(paseo)){
            return "Guardado!";
        }
        return "Ocurrio un error en el gurdado!";
    }

    @DELETE
    @Path("/eliminar/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String eliminarPaseo(@PathParam("id")String id){
        if(paseos.eliminarPaseo(id)){
            return "Eliminado!";
        }
        return "Ocurrio un error en la eliminación";
    }

    @PUT
    @Path("/modificar/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String modificarPaseo(@PathParam("id")String id,@QueryParam("origen") String origen,
    @QueryParam("destino") String destino){
        if (paseos.modificarPaseo(id,origen,destino)){
            return "Modificado";
        }
        return "Ocurrio un error en la modificación";
    }
}
