package br.com.project.universe.service;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.UUID;
import java.util.List;

import br.com.project.universe.entity.Star;
import br.com.project.universe.exception.StarAlreadyExistsException;
import br.com.project.universe.exception.StarNotFoundException;
import br.com.project.universe.dto.StarRequestDTO;
import br.com.project.universe.dto.StarResponseDTO;
import br.com.project.universe.mapper.StarMapper;
import br.com.project.universe.repository.StarRepository;

/**
 * The class responsible for business rules of stars
 * 
 * The class provides methods to create, list all, find by
 * UUID and to find stars by name.
 * 
 * @author nico-madruga
 * @version 1
 * 
 * StarService
 */

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

    public StarResponseDTO findStarById(UUID id)
    {
        Star findStar = starRepo.findByUUID(id).orElseThrow(() -> new StarNotFoundException("Star with the provided ID wasn't found"));

        return starMap.toDTO(findStar);
    }

    public StarResponseDTO findStarsByName(String name)
    {
        if(starRepo.existsByNameIgnoreCase(name))
        {
            throw new StarAlreadyExistsException("Star with the name " + name + " already exists");
        }

        return starMap.toDTO(starRepo.findStarsByName(name).orElseThrow(() -> new StarNotFoundException("Star with the name " + name + "wasn't found")));
    }
}
