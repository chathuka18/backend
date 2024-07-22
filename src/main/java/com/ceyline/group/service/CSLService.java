package com.ceyline.group.service;

import com.ceyline.group.model.CSL;
import com.ceyline.group.repo.CSLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSLService {
    @Autowired
    private CSLRepository cslRepository;

    public List<CSL> getAllCSL() {
        return cslRepository.findAll();
    }

    public CSL createCSL(CSL csl) {
        return cslRepository.save(csl);
    }

    public boolean deleteCSL(String id) {
        try {
            cslRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
