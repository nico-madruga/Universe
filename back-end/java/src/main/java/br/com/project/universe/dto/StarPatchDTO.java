package br.com.project.universe.dto;

import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record StarPatchDTO(

    @Size(min=3, max=100, message = "A stars name cannot must be between 3 and 100 characters long")
    String name,

    @PositiveOrZero(message = "The mass of a star must be positive")
    Double mass,
    
    @PositiveOrZero(message = "The temperature of a star must be positive")
    Long temperature
)
{}