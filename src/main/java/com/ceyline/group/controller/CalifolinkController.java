package com.ceyline.group.controller;


import com.ceyline.group.model.Califolink;
import com.ceyline.group.service.CalifolinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/cll")
public class CalifolinkController {

    @Autowired
    private CalifolinkService califolinkService;

    @GetMapping
    public ResponseEntity<List<Califolink>> getAllCalifolink() {
        List<Califolink> califolink = califolinkService.getAllCalifolink();
        return ResponseEntity.ok(califolink);
    }

    @PostMapping
    public ResponseEntity<?> createCalifolink(@RequestBody Califolink califolink) {
        try {
            Califolink createdCalifolink = califolinkService.createCalifolink(califolink);
            return new ResponseEntity<>(createdCalifolink, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCalifolink(@PathVariable("id") String id) {
        try {
            boolean deleted = califolinkService.deleteCalifolink(id);
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

