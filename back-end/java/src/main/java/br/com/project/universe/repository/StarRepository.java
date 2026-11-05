package br.com.project.universe.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.universe.entity.Star;

public interface StarRepository extends JpaRepository<Star, UUID>
{
    public Page<Star> findAll(Pageable pageable);
    
    public Optional<Star> findStarsByName(String name);

    public boolean existsByNameIgnoreCase(String name);
}