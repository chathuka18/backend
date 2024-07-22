package com.ceyline.group.controller;


import com.ceyline.group.model.CCS;
import com.ceyline.group.service.CCSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/ccs")
public class CCSController {

    @Autowired
    private CCSService ccsService;

    @GetMapping
    public ResponseEntity<List<CCS>> getAllCCS() {
        List<CCS> ccs = ccsService.getAllCCS();
        return ResponseEntity.ok(ccs);
    }

    @PostMapping
    public ResponseEntity<?> createCCS(@RequestBody CCS ccs) {
        try {
            CCS createdCCS = ccsService.createCCS(ccs);
            return new ResponseEntity<>(createdCCS, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCCS(@PathVariable("id") String id) {
        try {
            boolean deleted = ccsService.deleteCCS(id);
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
