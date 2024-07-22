package com.ceyline.group.controller;


import com.ceyline.group.model.MCM;
import com.ceyline.group.service.MCMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/mcm")
public class MCMController {

    @Autowired
    private MCMService mcmService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<MCM>> getAllMCM() {
        List<MCM> mcm = mcmService.getAllMCM();
        return ResponseEntity.ok(mcm);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<MCM> createMCM(@RequestBody MCM mcm) {
        try {
            MCM createdMCM = mcmService.createMCM(mcm);
            return new ResponseEntity<>(createdMCM, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteMCM(@PathVariable("id") String id) {
        try {
            boolean deleted = mcmService.deleteMCM(id);
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

