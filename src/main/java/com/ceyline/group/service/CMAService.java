package com.ceyline.group.service;

import com.ceyline.group.model.CMA;
import com.ceyline.group.repo.CMARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CMAService {
    @Autowired
    private CMARepository cmaRepository;

    public List<CMA> getAllCMA() {
        return cmaRepository.findAll();
    }

    public CMA createCMA(CMA cma) {
        return cmaRepository.save(cma);
    }

    public boolean deleteCMA(String id) {
        try {
            cmaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
