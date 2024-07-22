package com.ceyline.group.controller;


import com.ceyline.group.model.CAL;
import com.ceyline.group.service.CALService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/cal")
public class CALController {

    @Autowired
    private CALService calService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<CAL>> getAllCAL() {
        List<CAL> cal = calService.getAllCAL();
        return ResponseEntity.ok(cal);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<?> createCAL(@RequestBody CAL cal) {
        try {
            CAL createdCAL= calService.createCAL(cal);
            return new ResponseEntity<>(createdCAL, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCAL(@PathVariable("id") String id) {
        try {
            boolean deleted = calService.deleteCAL(id);
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



