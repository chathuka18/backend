package com.ceyline.group.service;


import com.ceyline.group.model.CAL;
import com.ceyline.group.repo.CALRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CALService {
    @Autowired
    private CALRepository calRepository;

    public List<CAL> getAllCAL() {
        return calRepository.findAll();
    }

    public CAL createCAL(CAL cal) {
        return calRepository.save(cal);
    }
    public boolean deleteCAL(String id) {
        try {
            calRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
