package br.com.project.universe.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column (name = "name", nullable = false, unique = true)
    private String name;

    @Column (name = "mass", nullable = false)
    private Long mass;

    @Column (name = "radius", nullable = false)
    private Long radius;

    @Column (name = "temperature", nullable = false)
    private Long temperature;

    @OneToMany(mappedBy = "planet")
    private List<OrbitalRelationship> relationships;

}
