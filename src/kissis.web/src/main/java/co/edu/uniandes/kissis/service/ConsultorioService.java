package co.edu.uniandes.kissis.service;

import co.edu.uniandes.kissis.dtos.ConsultorioDTO;
import co.edu.uniandes.kissis.ejb.IConsultorioLogic;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * Clase que contiene lo relacionado con el servicio REST
 */
@Path("/consult")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ConsultorioService {
    
    @Context 
    private HttpServletResponse response;
    
    @Inject
    private IConsultorioLogic consultorioLogic;
    
    /**
     * Metodo POST para la creación de un libro
     * @param dto
     * @return 
     */
    @POST
    public ConsultorioDTO createConsultorio(ConsultorioDTO dto) {
        return consultorioLogic.createConsultorio(dto);
    }

    /**
     * Metodo GET para obtener los libros
     * @return 
     */
    @GET
    public List<ConsultorioDTO> getConsultorios() {
        return consultorioLogic.getConsultorios();
    }
    
    /**
     * Metodo PUT utilizado principalmente para actualizar
     * @return 
     */
    @PUT
    @Path("{id: \\d+}")
    public ConsultorioDTO updateConsultorio(@PathParam("id") Long id, ConsultorioDTO dto) {
        return consultorioLogic.updateConsultorio(id,dto);
    }

    /**
     * Metodo DELETE usado para eliminar un elemento
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteConsultorio(@PathParam("id") Long id) {
        consultorioLogic.deleteConsultorio(id);
    }
}