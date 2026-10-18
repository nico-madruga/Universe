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

import br.com.project.universe.dto.StarRequestDTO;
import br.com.project.universe.dto.StarResponseDTO;
import br.com.project.universe.entity.Star;
import br.com.project.universe.service.StarService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/universe/stars")
public class StarController 
{
    StarService starS;

    public StarController(StarService starS)
    {
        this.starS = starS;
    }

    @PostMapping("/create")
    public ResponseEntity<StarResponseDTO> createStar(@Valid @RequestBody StarRequestDTO newStarInfo)
    {
        StarResponseDTO newStar = starS.createStar(newStarInfo);
        return ResponseEntity.ok(newStar);
    }

    @GetMapping()
    public ResponseEntity listStars() //must return a ResponseEntity<List<Stars>>
    {
        return ResponseEntity.ok("this ain't implemented yet or not updated dummy"); //just so it isn't red
    }

    @GetMapping("/{id}")
    public ResponseEntity listStarsByID(@PathVariable Long id) //must return a ResponseEntity<Star>
    {
        return ResponseEntity.ok("this ain't implemented yet or not updated dummy"); //just so it isn't red
    }

    @GetMapping("/name")
    public ResponseEntity listStarsByName(@RequestParam(required = true) String name) //must return a ResponseEntity<Star>
    {
        return ResponseEntity.ok("this ain't implemented yet or not updated dummy"); //just so it isn't red
    }

    @PutMapping("/{id}")
    public ResponseEntity updateStarFully(@PathVariable Long id) //must return a confirmation message
    {
        return ResponseEntity.ok("this ain't implemented yet or not updated dummy"); //just so it isn't red
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity updateStarParcially(@PathVariable Long id) //must return a confirmation message
    {
        return ResponseEntity.ok("this ain't implemented yet or not updated dummy"); //just so it isn't red
    }

    @DeleteMapping("/{id}")
    public ResponseEntity removeStar(@PathVariable Long id) //must return a confirmation message
    {
        return ResponseEntity.ok("this ain't implemented yet or not updated dummy"); //just so it isn't red
    }
}
