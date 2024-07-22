package com.ceyline.group.service;

import com.ceyline.group.model.MCM;
import com.ceyline.group.repo.MCMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MCMService {
    @Autowired
    private MCMRepository mcmRepository;

    public List<MCM> getAllMCM() {
        return mcmRepository.findAll();
    }

    public MCM createMCM(MCM mcm) {
        return mcmRepository.save(mcm);
    }

    public boolean deleteMCM(String id) {
        try {
            mcmRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
