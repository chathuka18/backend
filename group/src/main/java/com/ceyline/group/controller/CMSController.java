package com.ceyline.group.controller;

import com.ceyline.group.model.CMS;
import com.ceyline.group.service.CMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/cms")
public class CMSController {

    @Autowired
    private CMSService cmsService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public ResponseEntity<List<CMS>> getAllCMS() {
        List<CMS> cms = cmsService.getAllCMS();
        return ResponseEntity.ok(cms);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public ResponseEntity<CMS> createCMS(@RequestBody CMS cms) {
        try {
            CMS createdCMS = cmsService.createCMS(cms);
            return new ResponseEntity<>(createdCMS, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCMS(@PathVariable("id") String id) {
        try {
            boolean deleted = cmsService.deleteCMS(id);
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
