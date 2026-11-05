package br.com.project.universe.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record StarRequestDTO (
    
    @NotBlank(message = "mass cannot be empty")
    @Size(min=3, max=100, message = "A stars name cannot must be between 3 and 100 characters long")
    String name,

    @NotNull(message = "mass cannot be empty")
    @PositiveOrZero(message = "The mass of a star must be positive")
    Long mass,

    @NotNull(message = "temperature cannot be empty")
    @PositiveOrZero(message = "The temperature of a star must be positive")
    Long temperature
)
{

}
