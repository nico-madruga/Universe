package br.com.project.universe.service;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

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

    public StarResponseDTO createStar(StarRequestDTO newStar)
    {
        Star star = starMap.toEntity(newStar);
        starRepo.save(star);
        return starMap.toDTO(star);
    }

    public Page<StarResponseDTO> listStars(Pageable pageable)
    {
        return starRepo.findAll(pageable).map(starMap::toDTO);
    }

}
