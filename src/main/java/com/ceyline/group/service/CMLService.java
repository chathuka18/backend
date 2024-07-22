package com.ceyline.group.service;


import com.ceyline.group.model.CML;
import com.ceyline.group.repo.CMLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CMLService {
    @Autowired
    private CMLRepository cmlRepository;

    public List<CML> getAllCML() {
        return cmlRepository.findAll();
    }

    public CML createCML(CML cml) {
        return cmlRepository.save(cml);
    }

    public boolean deleteCML(String id) {
        try {
            cmlRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
