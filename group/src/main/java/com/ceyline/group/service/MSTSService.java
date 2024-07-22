package com.ceyline.group.service;

import com.ceyline.group.model.MSTS;
import com.ceyline.group.repo.MSTSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MSTSService {
    @Autowired
    private MSTSRepository mstsRepository;

    public List<MSTS> getAllMSTS() {
        return mstsRepository.findAll();
    }
    public MSTS createMSTS(MSTS msts) {
        return mstsRepository.save(msts);
    }

    public boolean deleteMSTS(String id) {
        try {
            mstsRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
