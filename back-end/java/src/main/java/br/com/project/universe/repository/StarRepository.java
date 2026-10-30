package br.com.project.universe.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.universe.entity.Star;

public interface StarRepository extends JpaRepository<Star, Long>
{
    public Page<Star> findAll(Pageable pageable);
    
    public Optional<Star> findByUUID(UUID id);

    public Optional<Star> findStarsByName(String name);

    public boolean existsByNameIgnoreCase(String name);
}