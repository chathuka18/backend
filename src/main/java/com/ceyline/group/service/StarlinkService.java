package com.ceyline.group.service;

import com.ceyline.group.model.Starlink;
import com.ceyline.group.repo.StarlinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarlinkService {
    @Autowired
    private StarlinkRepository starlinkRepository;

    public List<Starlink> getAllStarlink() {
        return starlinkRepository.findAll();
    }

    public Starlink createStarlink(Starlink starlink) {
        return starlinkRepository.save(starlink);
    }

    public boolean deleteStarlink(String id) {
        try {
            starlinkRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
