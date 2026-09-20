package br.com.project.universe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@ToString 
@Entity 
public class Star 
{
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "mass")
    private double mass;

    @Column(name = "temperature")
    private double temperature;
}
