package br.com.project.universe.dto;
import java.util.UUID;


public record StarResponseDTO (

    UUID id,
    String name,
    Double mass,
    Double temperature
){

}
