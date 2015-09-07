package co.edu.uniandes.kissis.converters;

import co.edu.uniandes.kissis.dtos.ConsultorioDTO;
import co.edu.uniandes.kissis.entities.ConsultorioEntity;
import java.util.ArrayList;
import java.util.List;

public abstract class ConsultorioConverter {

   public static ConsultorioDTO basicEntity2DTO(ConsultorioEntity entity) {
        if (entity != null) {
            ConsultorioDTO dto = new ConsultorioDTO();
            dto.setId(entity.getId());
            dto.setEspecialidad(entity.getEspecialidad());
            dto.setTipo(entity.getTipo());
            dto.setImage(entity.getImage());
            dto.setTamanio(entity.getTamanio());
            dto.setExtension(entity.getExtension());

            return dto;
        } else {
            return null;
        }
    }

    public static ConsultorioEntity basicDTO2Entity(ConsultorioDTO dto) {
        if (dto != null) {
            ConsultorioEntity entity = new ConsultorioEntity();
            entity.setId(entity.getId());
            entity.setEspecialidad(entity.getEspecialidad());
            entity.setTipo(entity.getTipo());
            entity.setImage(entity.getImage());
            entity.setTamanio(entity.getTamanio());
            entity.setExtension(entity.getExtension());

            return entity;
        } else {
            return null;
        }
    }

    public static List<ConsultorioDTO> listEntity2DTO(List<ConsultorioEntity> entities) {
        List<ConsultorioDTO> dtos = new ArrayList<ConsultorioDTO>();
        if (entities != null) {
            for (ConsultorioEntity entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    public static List<ConsultorioEntity> listDTO2Entity(List<ConsultorioDTO> dtos) {
        List<ConsultorioEntity> entities = new ArrayList<ConsultorioEntity>();
        if (dtos != null) {
            for (ConsultorioDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }

}


