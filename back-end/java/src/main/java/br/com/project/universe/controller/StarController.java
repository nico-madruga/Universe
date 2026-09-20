package br.com.project.universe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.universe.dto.StarRequestDTO;
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

    @GetMapping("/create")
    public ResponseEntity createStar(@RequestBody StarRequestDTO newStar)
    {
        return ResponseEntity.ok("s"); //just so it isn't red
    }

    @GetMapping("/checkout/all")
    public ResponseEntity listStars() //must return a ResponseEntity<List<Stars>>
    {
        return ResponseEntity.ok("s"); //just so it isn't red
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
