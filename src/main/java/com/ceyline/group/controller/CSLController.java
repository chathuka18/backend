package com.ceyline.group.controller;

import com.ceyline.group.model.CSL;
import com.ceyline.group.service.CSLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/csl")
public class CSLController {

    @Autowired
    private CSLService cslService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<CSL>> getAllCSL() {
        List<CSL> csl = cslService.getAllCSL();
        return ResponseEntity.ok(csl);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<CSL> createCSL(@RequestBody CSL csl) {
        try {
            CSL createdCSL = cslService.createCSL(csl);
            return new ResponseEntity<>(createdCSL, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCSL(@PathVariable("id") String id) {
        try {
            boolean deleted = cslService.deleteCSL(id);
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

