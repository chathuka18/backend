package com.ceyline.group.controller;

import com.ceyline.group.model.MSTS;
import com.ceyline.group.service.MSTSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/msts")
public class MSTSController {
    @Autowired
    private MSTSService mstsService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<MSTS>> getAllMSTS() {
        List<MSTS> msts = mstsService.getAllMSTS();
        return ResponseEntity.ok(msts);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<MSTS> createMSTS(@RequestBody MSTS msts) {
        try {
            MSTS createdMSTS = mstsService.createMSTS(msts);
            return new ResponseEntity<>(createdMSTS, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteMSTS(@PathVariable("id") String id) {
        try {
            boolean deleted = mstsService.deleteMSTS(id);
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
