package co.edu.uniandes.kissis.dtos;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase que contiene el DTO 
 */
@XmlRootElement
public class AdminDTO {
    
    /** Atributos de la clase */
    private Long id;
    private String nombre;
    private String apellido;
    private String imagen;
    private String tipoCC;
    private int CC;
    private String genero;
    private Date fechaN;
  
        
    /** Metodos set y get de los atributos */    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImage() {
        return imagen;
    }

    public void setImage(String imagen) {
        this.imagen = imagen;
    }

    public String getTipoCC() {
        return tipoCC;
    }

    public void setTipoCC(String tipoDocumento) {
        this.tipoCC = tipoDocumento;
    }
     
    public int getCC() {
        return CC;
    }

    public void setCC( int CC) {
        this.CC = CC;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String Genero) {
        this.genero = genero;
    }
    
    public Date getfechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }
    
    
   
}

