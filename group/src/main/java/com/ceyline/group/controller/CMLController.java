package com.ceyline.group.controller;

import com.ceyline.group.model.CML;
import com.ceyline.group.service.CMLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/cml")
public class CMLController {

    @Autowired
    private CMLService cmlService;

    @GetMapping
    public ResponseEntity<List<CML>> getAllCML() {
        List<CML> cml = cmlService.getAllCML();
        return ResponseEntity.ok(cml);
    }

    @PostMapping
    public ResponseEntity<?> createCML(@RequestBody CML cml) {
        try {
            CML createdCML = cmlService.createCML(cml);
            return new ResponseEntity<>(createdCML, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCML(@PathVariable("id") String id) {
        try {
            boolean deleted = cmlService.deleteCML(id);
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
