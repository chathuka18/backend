package com.ceyline.group.service;

import com.ceyline.group.model.NVOCC;
import com.ceyline.group.repo.NVOCCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NVOCCService {
    @Autowired
    private NVOCCRepository nvoccRepository;

    public List<NVOCC> getAllNVOCC() {
        return nvoccRepository.findAll();
    }
    public NVOCC createNVOCC(NVOCC nvocc) {
        return nvoccRepository.save(nvocc);
    }
    public boolean deleteNVOCC(String id) {
        try {
            nvoccRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
