package com.ceyline.group.service;

import com.ceyline.group.model.Califolink;
import com.ceyline.group.repo.CalifolinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalifolinkService {
    @Autowired
    private CalifolinkRepository califolinkRepository;

    public List<Califolink> getAllCalifolink() {
        return califolinkRepository.findAll();
    }

    public Califolink createCalifolink(Califolink califolink) {
        return califolinkRepository.save(califolink);
    }

    public boolean deleteCalifolink(String id) {
        try {
            califolinkRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
