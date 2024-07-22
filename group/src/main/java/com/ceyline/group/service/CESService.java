package com.ceyline.group.service;

import com.ceyline.group.model.CES;
import com.ceyline.group.repo.CESRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CESService {
    @Autowired
    private CESRepository cesRepository;

    public List<CES> getAllCES() {
        return cesRepository.findAll();
    }

    public CES createCES(CES ces) {
        return cesRepository.save(ces);
    }

    public boolean deleteCES(String id) {
        try {
            cesRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
