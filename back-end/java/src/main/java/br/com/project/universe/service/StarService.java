package br.com.project.universe.service;

import org.springframework.stereotype.Service;
import java.util.List;

import br.com.project.universe.entity.Star;
import br.com.project.universe.dto.StarRequestDTO;
import br.com.project.universe.dto.StarResponseDTO;
import br.com.project.universe.mapper.StarMapper;
import br.com.project.universe.repository.StarRepository;


@Service 
public class StarService 
{
    private StarRepository starRepo;
    private StarMapper starMap;

    public StarService(StarRepository starRepo, StarMapper starMap)
    {
        this.starRepo = starRepo;
        this.starMap = starMap;
    }

    public void createStar(StarRequestDTO newStar)
    {
        Star star = starMap.toEntity(newStar);

        starRepo.save(star);
    }

    public List<StarResponseDTO> listStars()
    {
        List<Star> stars = starRepo.findAll();

        return starMap.toListDTO(stars);
    }

}
