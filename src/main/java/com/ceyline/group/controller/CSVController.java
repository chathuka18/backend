package com.ceyline.group.controller;


import com.ceyline.group.model.CSV;
import com.ceyline.group.service.CSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/csv")
public class CSVController {

    @Autowired
    private CSVService csvService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<CSV>> getAllCSV() {
        List<CSV> csv = csvService.getAllCSV();
        return ResponseEntity.ok(csv);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<CSV> createCSV(@RequestBody CSV csv) {
        try {
            CSV createdCSV = csvService.createCSV(csv);
            return new ResponseEntity<>(createdCSV, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCSV(@PathVariable("id") String id) {
        try {
            boolean deleted = csvService.deleteCSV(id);
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


