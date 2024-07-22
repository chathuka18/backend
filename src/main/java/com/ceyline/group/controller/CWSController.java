package com.ceyline.group.controller;


import com.ceyline.group.model.CWS;
import com.ceyline.group.service.CWSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/cws")
public class CWSController {

    @Autowired
    private CWSService cwsService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<CWS>> getAllCWS() {
        List<CWS> cws = cwsService.getAllCWS();
        return ResponseEntity.ok(cws);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<CWS> createCWS(@RequestBody CWS cws) {
        try {
            CWS createdCWS = cwsService.createCWS(cws);
            return new ResponseEntity<>(createdCWS, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCWS(@PathVariable("id") String id) {
        try {
            boolean deleted = cwsService.deleteCWS(id);
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



