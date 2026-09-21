package br.com.project.universe.mapper;

import org.springframework.stereotype.Component;

import br.com.project.universe.dto.StarRequestDTO;
import br.com.project.universe.dto.StarResponseDTO;
import br.com.project.universe.entity.Star;

@Component 
public class StarMapper 
{
    public Star toEntity(StarRequestDTO starDTO)
    {
        Star starEntity = new Star(
            starDTO.name(), 
            starDTO.mass(), 
            starDTO.temperature());

        return starEntity;
    }

    public StarResponseDTO toDTO(Star star)
    {
        StarResponseDTO starResponse = new StarResponseDTO(
            star.getName(),
            star.getMass(),
            star.getTemperature());

            return starResponse;
    }
}
