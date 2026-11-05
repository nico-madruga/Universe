package br.com.project.universe.dto;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record StarPatchDTO(

    @Size(min=3, max=100, message = "A stars name cannot must be between 3 and 100 characters long")
    String name,

    @Positive(message = "The mass of a star must be positive")
    Double mass,

    Double temperature
)
{}