package com.ceyline.group.service;

import com.ceyline.group.model.CCS;
import com.ceyline.group.model.CML;
import com.ceyline.group.repo.CCSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CCSService {
    @Autowired
    private CCSRepository ccsRepository;

    public List<CCS> getAllCCS() {
        return ccsRepository.findAll();
    }

    public CCS createCCS(CCS ccs) {
        return ccsRepository.save(ccs);
    }

    public boolean deleteCCS(String id) {
        try {
            ccsRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
