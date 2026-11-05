package br.com.project.universe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.web.PageableDefault;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import java.util.UUID;

import br.com.project.universe.dto.StarPatchDTO;
import br.com.project.universe.dto.StarRequestDTO;
import br.com.project.universe.dto.StarResponseDTO;
import br.com.project.universe.service.StarService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

/**
 * StarController
 * 
 * The class responsible for endpoint mapping of stars
 * 
 * The class provides methods to create, list all, find by ID,
 * list by name, update stars fully and partially and remove stars
 * 
 * @author nico-madruga
 * @version 1
 */

@Tag(name = "StarController", description = "Class responsible for endpoint mapping of stars")
@RestController
@RequestMapping("/v1/universe/stars")
public class StarController 
{
    private final StarService starS;

    public StarController(StarService starS)
    {
        this.starS = starS;
    }

    @Operation( summary = "Creates stars",
    responses = 
    {
        @ApiResponse (responseCode = "200", description = "Star was created"),
        @ApiResponse (responseCode = "500", description = "Internal server error", content = @Content())
    })
    @Parameter(description = "The JSON provided by the user")
    @PostMapping
    public ResponseEntity<StarResponseDTO> createStar(@Valid @RequestBody StarRequestDTO newStarInfo)
    {
        StarResponseDTO newStar = starS.createStar(newStarInfo);
        return ResponseEntity.ok(newStar);
    }

    @Operation(summary = "Lists all stars",
        responses = {
            @ApiResponse (responseCode = "200", description = "Star was found"),
            @ApiResponse (responseCode = "500", description = "Internal server error", content = @Content())
        }
    )
    @GetMapping
    public ResponseEntity<Page<StarResponseDTO>> listStars(@PageableDefault(page = 0, size = 10) Pageable pageable)
    {
        Page<StarResponseDTO> stars = starS.listStars(pageable);

        return ResponseEntity.ok(stars);
    }

    @Operation(summary = "Finds a star by its UUID",
        responses = {
            @ApiResponse (responseCode = "200", description = "Star was found"),
            @ApiResponse (responseCode = "404", description = "Star wasn't found", content = @Content)
        }
    )
    @GetMapping("/{id}")
    public ResponseEntity<StarResponseDTO> findStarByID(@PathVariable UUID id)
    {
        StarResponseDTO starFound = starS.findStarById(id);

        return ResponseEntity.ok(starFound);
    }

    @Operation(summary = "Finds a star by its name",
        responses = {
            @ApiResponse (responseCode = "200", description = "Star was found"),
            @ApiResponse (responseCode = "404", description = "Star wasn't found", content = @Content)
        }
    )
    @Parameter(description = "The desired star name")
    @GetMapping("/search")
    public ResponseEntity<StarResponseDTO> listStarsByName(@RequestParam(required = true) String name)
    {
        StarResponseDTO starFound = starS.findStarsByName(name);

        return ResponseEntity.ok(starFound);
    } 

    @Operation(summary = "Update all Star information",
        responses = {
            @ApiResponse (responseCode = "200" , description = "Star was updated"),
            @ApiResponse (responseCode = "404", description = "Star wasn't found", content = @Content)
        }
    )
    @Parameter(description = "The JSON provided by the user")
    @PutMapping("/{id}")
    public ResponseEntity<String> updateStarFully(@PathVariable UUID id, @Valid @RequestBody StarRequestDTO request)
    {
        starS.updateStarFully(id, request);

        return ResponseEntity.ok("The star was updated successfully!");
    }

    @Operation(summary = "Update all Star information",
        responses = {
            @ApiResponse (responseCode = "200" , description = "Star was updated"),
            @ApiResponse (responseCode = "200" , description = "Stars information wasn't changed"),
            @ApiResponse (responseCode = "404", description = "Star wasn't found", content = @Content)
        }
    )
    @Parameter(description = "The JSON provided by the user")
    @PatchMapping("/update/{id}")
    public ResponseEntity<String> updateStarParcially(@PathVariable UUID id, @Valid @RequestBody StarPatchDTO request) //must return a confirmation message
    {
        boolean changed = starS.updateStarPartially(id, request);

        if(!changed)
        {
            return ResponseEntity.ok("No changes were made");
        }

        return ResponseEntity.ok("The star was updated successfully!");
    }

    @Operation(summary = "Deletes a star",
        responses = {
            @ApiResponse(responseCode = "204", description = "Star was deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Star wasn't found")
        }
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeStar(@PathVariable UUID id)
    {
        starS.deleteStar(id);

        return ResponseEntity.ok("Star deleted successfully!");
    }
}
