package com.ceyline.group.service;

import com.ceyline.group.model.Oceaneeds;
import com.ceyline.group.repo.OceaneedsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OceanService {
    @Autowired
    private OceaneedsRepository oceaneedsRepository;

    public List<Oceaneeds> getAllOceaneeds() {
        return oceaneedsRepository.findAll();
    }
    public Oceaneeds createOceaneeds(Oceaneeds oceaneeds) {
        return oceaneedsRepository.save(oceaneeds);
    }

    public boolean deleteOceaneeds(String id) {
        try {
            oceaneedsRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

