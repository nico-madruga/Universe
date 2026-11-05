package br.com.project.universe.service;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.Optional;
import java.util.UUID;

import br.com.project.universe.entity.Star;
import br.com.project.universe.exception.StarAlreadyExistsException;
import br.com.project.universe.exception.StarNotFoundException;
import br.com.project.universe.dto.StarPatchDTO;
import br.com.project.universe.dto.StarRequestDTO;
import br.com.project.universe.dto.StarResponseDTO;
import br.com.project.universe.mapper.StarMapper;
import br.com.project.universe.repository.StarRepository;
import jakarta.transaction.Transactional;

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
    private final StarRepository starRepo;
    private final StarMapper starMap;

    public StarService(StarRepository starRepo, StarMapper starMap)
    {
        this.starRepo = starRepo;
        this.starMap = starMap;
    }

    @Transactional
    public StarResponseDTO createStar(StarRequestDTO newStar)
    {
        boolean starExists = starRepo.existsByNameIgnoreCase(newStar.name());

        if(starExists)
        {
            throw new StarAlreadyExistsException("A star with the name " + newStar.name() + " already exists.");
        }

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
        Star findStar = starRepo.findById(id).orElseThrow(() -> new StarNotFoundException("Star with the provided ID wasn't found"));

        return starMap.toDTO(findStar);
    }

    public StarResponseDTO findStarsByName(String name)
    {
        return starMap.toDTO(starRepo.findStarsByName(name).orElseThrow(() -> new StarNotFoundException("Star with the name " + name + "wasn't found")));
    }

    @Transactional
    public void updateStarFully(UUID id, StarRequestDTO request)
    {
        Star findStar = starRepo.findById(id).orElseThrow(() -> new StarNotFoundException("Star wasn't found"));

        findStar.setMass(request.mass());
        findStar.setName(request.name());
        findStar.setTemperature(request.temperature());
    }

    @Transactional
    public boolean updateStarPartially(UUID id, StarPatchDTO request)
    {
        Star findStar = starRepo.findById(id).orElseThrow(() -> new StarNotFoundException("Star wasn't found"));

        boolean changed = false;

        if(request.mass() != null)
        {
            findStar.setMass(request.mass());
            changed = true;
        }

        if(request.name() != null)
        {
            findStar.setName(request.name());
            changed = true;
        }

        if(request.temperature() != null)
        {
            findStar.setTemperature(request.temperature());
            changed = true;
        }

        return changed;
    }

    public void deleteStar(UUID id)
    {
        starRepo.deleteById(id);
    }
}
