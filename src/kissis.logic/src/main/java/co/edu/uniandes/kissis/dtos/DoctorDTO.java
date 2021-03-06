package co.edu.uniandes.kissis.dtos;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase que contiene el DTO 
 */
@XmlRootElement
public class DoctorDTO {
    
    /** Atributos de la clase */
    private Long id;
    
    private String nombre;
    
    private String apellido;
    
    private String tipoId;

    private String idDato;

    private String especialidad;
    
    private String genero;
    
    private Date fechaNac;
    
  
        
    /** Metodos set y get de los atributos */    
    
    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido() 
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public String getTipoId() 
    {
        return tipoId;
    }

    public void setTipoId(String tipoID)
    {
        this.tipoId = tipoID;
    }
    
    public String getIdDato() 
    {
        return idDato;
    }

    public void setIdDato(String idDato)
    {
        this.idDato = idDato;
    }
    
    public String getEspecialidad()
    {
        return especialidad;
    }

    public void setEspecialidad(String esp)
    {
        this.especialidad = esp;
    }

    public String getGenero() 
    {
        return genero;
    }

    public void setGenero(String genero) 
    {
        this.genero = genero;
    }

    public Date getFechaNac() 
    {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) 
    {
        this.fechaNac = fechaNac;
    }
}
