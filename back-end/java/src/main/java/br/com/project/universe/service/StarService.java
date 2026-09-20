package br.com.project.universe.service;

import org.springframework.stereotype.Service;

import br.com.project.universe.dto.StarRequestDTO;
import br.com.project.universe.dto.StarResponseDTO;
import br.com.project.universe.mapper.StarMapper;
import br.com.project.universe.repository.StarRepository;

@Service 
public class StarService 
{
    StarRepository starRepo;
    StarMapper starMap;

    public StarService(StarRepository starRepo, StarMapper starMap)
    {
        this.starRepo = starRepo;
        this.starMap = starMap;
    }

}
