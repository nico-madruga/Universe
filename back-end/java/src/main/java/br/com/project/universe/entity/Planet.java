package br.com.project.universe.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Planet 
{
    private UUID id;
    String name;
    Long mass;
    Long radius;
    Long temperature;
    
}
