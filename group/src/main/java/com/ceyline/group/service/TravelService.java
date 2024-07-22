package com.ceyline.group.service;

import com.ceyline.group.model.Travel;
import com.ceyline.group.repo.TravelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {
    @Autowired
    private TravelsRepository travelRepository;

    public List<Travel> getAllTravels() {
        return travelRepository.findAll();
    }
    public Travel createTravel(Travel travel) {
        return travelRepository.save(travel);
    }

    public boolean deleteTravels(String id) {
        try {
            travelRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
