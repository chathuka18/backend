package com.ceyline.group.controller;

import com.ceyline.group.model.Oceaneeds;
import com.ceyline.group.service.OceanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/oceaneeds")
public class OceaneedsController {
    @Autowired
    private OceanService oceanService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<Oceaneeds>> getAllOceaneeds() {
        List<Oceaneeds> oceanneeds = oceanService.getAllOceaneeds();
        return ResponseEntity.ok(oceanneeds);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<Oceaneeds> createOceaneeds(@RequestBody Oceaneeds oceaneeds) {
        try {
            Oceaneeds createdOceaneeds = oceanService.createOceaneeds(oceaneeds);
            return new ResponseEntity<>(createdOceaneeds, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteOceaneeds(@PathVariable("id") String id) {
        try {
            boolean deleted = oceanService.deleteOceaneeds(id);
            if (deleted) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}