package com.ceyline.group.controller;

import com.ceyline.group.model.NVOCC;
import com.ceyline.group.service.NVOCCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/nvocc")
public class NVOCCController {
    @Autowired
    private NVOCCService nvoccService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<NVOCC>> getAllNVOCC() {
        List<NVOCC> nvocc = nvoccService.getAllNVOCC();
        return ResponseEntity.ok(nvocc);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<NVOCC> createNVOCC(@RequestBody NVOCC nvocc) {
        try {
            NVOCC createdNVOCC = nvoccService.createNVOCC(nvocc);
            return new ResponseEntity<>(createdNVOCC, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteNVOCC(@PathVariable("id") String id) {
        try {
            boolean deleted = nvoccService.deleteNVOCC(id);
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
