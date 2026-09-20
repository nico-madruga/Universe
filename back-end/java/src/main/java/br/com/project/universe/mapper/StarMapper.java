package br.com.project.universe.mapper;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.com.project.universe.dto.StarRequestDTO;
import br.com.project.universe.dto.StarResponseDTO;
import br.com.project.universe.entity.Star;

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

    public List<StarResponseDTO> toListDTO(List<Star> stars)
    {
        return stars.stream()
                    .map(star -> toDTO(star))
                    .toList();
    }
}
