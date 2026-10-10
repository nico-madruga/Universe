package br.com.project.universe.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record StarRequestDTO (
    
    @NotBlank
    @Size (min=3, max=100, message = "A starts name cannot must be between 3 and 100 characters long")
    String name,

    @NotBlank
    @Positive(message = "The mass of a star must be positive")
    double mass,

    @NotBlank
    double temperature
)
{

}
