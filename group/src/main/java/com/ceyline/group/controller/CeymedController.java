package com.ceyline.group.controller;


import com.ceyline.group.model.Ceymed;
import com.ceyline.group.service.CeymedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/ceymed")
public class CeymedController {

    @Autowired
    private CeymedService ceymedService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<Ceymed>> getAllCeymed() {
        List<Ceymed> ceymed = ceymedService.getAllCeymed();
        return ResponseEntity.ok(ceymed);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<Ceymed> createCeymed(@RequestBody Ceymed ceymed) {
        try {
            Ceymed createdCeymed = ceymedService.createCeymed(ceymed);
            return new ResponseEntity<>(createdCeymed, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCeymed(@PathVariable("id") String id) {
        try {
            boolean deleted = ceymedService.deleteCeymed(id);
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

