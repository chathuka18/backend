package com.ceyline.group.controller;

import com.ceyline.group.model.Starlink;
import com.ceyline.group.service.StarlinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/starlink")
public class StarlinkController {
    @Autowired
    private StarlinkService starlinkService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<Starlink>> getAllStarlink() {
        List<Starlink> starlink = starlinkService.getAllStarlink();
        return ResponseEntity.ok(starlink);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<Starlink> createStarlink(@RequestBody Starlink starlink) {
        try {
            Starlink createdStarlink = starlinkService.createStarlink(starlink);
            return new ResponseEntity<>(createdStarlink, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteStarlink(@PathVariable("id") String id) {
        try {
            boolean deleted = starlinkService.deleteStarlink(id);
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
