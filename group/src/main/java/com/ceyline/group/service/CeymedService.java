package com.ceyline.group.service;

import com.ceyline.group.model.Ceymed;
import com.ceyline.group.repo.CeymedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CeymedService {
    @Autowired
    private CeymedRepository ceymedRepository;

    public List<Ceymed> getAllCeymed() {
        return ceymedRepository.findAll();
    }

    public Ceymed createCeymed(Ceymed ceymed) {
        return ceymedRepository.save(ceymed);
    }

    public boolean deleteCeymed(String id) {
        try {
            ceymedRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}