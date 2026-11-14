package br.com.project.universe.entity;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@NoArgsConstructor 
@ToString 
@Entity 
public class Star 
{
    @Id 
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;

    @Column (name = "name", nullable = false, unique = true)
    private String name;

    @Column (name = "mass", nullable = false)
    private double mass;

    @Column(name = "temperature", nullable = false)
    private Long temperature;

    @OneToMany (mappedBy = "planet")
    private List<OrbitalRelationship> orbitalRelationships;

    public Star(String name, double mass, Long temperature)
    {
        this.name = name;
        this.mass = mass;
        this.temperature = temperature;
    }

}
