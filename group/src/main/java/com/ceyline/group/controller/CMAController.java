package com.ceyline.group.controller;


import com.ceyline.group.model.CMA;
import com.ceyline.group.service.CMAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/cma")
public class CMAController {

    @Autowired
    private CMAService cmaService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<CMA>> getAllCMA() {
        List<CMA> cma = cmaService.getAllCMA();
        return ResponseEntity.ok(cma);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<CMA> createCMA(@RequestBody CMA cma) {
        try {
            CMA createdCMA = cmaService.createCMA(cma);
            return new ResponseEntity<>(createdCMA, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCMA(@PathVariable("id") String id) {
        try {
            boolean deleted = cmaService.deleteCMA(id);
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


