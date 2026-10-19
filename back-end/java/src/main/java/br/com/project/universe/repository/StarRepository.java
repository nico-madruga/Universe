package br.com.project.universe.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.universe.entity.Star;

public interface StarRepository extends JpaRepository<Star, Long>
{
    public Page<Star> findAll(Pageable pageable);
}