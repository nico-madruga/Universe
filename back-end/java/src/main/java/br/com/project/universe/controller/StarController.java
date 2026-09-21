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

import java.util.List;

import br.com.project.universe.dto.StarRequestDTO;
import br.com.project.universe.dto.StarResponseDTO;
import br.com.project.universe.service.StarService;

@RestController
@RequestMapping("/v1/universe/star")
public class StarController 
{
    StarService starS;

    public StarController(StarService starS)
    {
        this.starS = starS;
    }

    @PostMapping("/create")
    public ResponseEntity createStar(@RequestBody StarRequestDTO newStar)
    {
        starS.createStar(newStar);
        return ResponseEntity.ok("Star was successfully created");
    }

    @GetMapping("/checkout/all")
    public ResponseEntity<List<StarResponseDTO>> listStars()
    {
        List<StarResponseDTO> stars = starS.listStars();

        return ResponseEntity.ok(stars);
    }

    @GetMapping("/checkout/{id}")
    public ResponseEntity listStarsByID(@PathVariable Long id) //must return a ResponseEntity<Star>
    {
        return ResponseEntity.ok("s"); //just so it isn't red
    }

    @GetMapping("/checkout")
    public ResponseEntity listStarsByName(@RequestParam String name) //must return a ResponseEntity<Star>
    {
        return ResponseEntity.ok("s"); //just so it isn't red
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateStarFully(@PathVariable Long id) //must return a confirmation message
    {
        return ResponseEntity.ok("s"); //just so it isn't red
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity updateStarParcially(@PathVariable Long id) //must return a confirmation message
    {
        return ResponseEntity.ok("s"); //just so it isn't red
    }

    @DeleteMapping("/remove/id")
    public ResponseEntity removeStar(@PathVariable Long id) //must return a confirmation message
    {
        return ResponseEntity.ok("s"); //just so it isn't red
    }
}
