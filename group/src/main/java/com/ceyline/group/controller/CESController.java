package com.ceyline.group.controller;


import com.ceyline.group.model.CES;
import com.ceyline.group.service.CESService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/ces")
public class CESController {

    @Autowired
    private CESService cesService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<CES>> getAllCES() {
        List<CES> ces = cesService.getAllCES();
        return ResponseEntity.ok(ces);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<CES> createCES(@RequestBody CES ces) {
        try {
            CES createdCES = cesService.createCES(ces);
            return new ResponseEntity<>(createdCES, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCES(@PathVariable("id") String id) {
        try {
            boolean deleted = cesService.deleteCES(id);
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

