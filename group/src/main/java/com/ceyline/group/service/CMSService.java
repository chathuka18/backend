package com.ceyline.group.service;

import com.ceyline.group.model.CMS;
import com.ceyline.group.repo.CMSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CMSService {
    @Autowired
    private CMSRepository cmsRepository;

    public List<CMS> getAllCMS() {
        return cmsRepository.findAll();
    }

    public CMS createCMS(CMS cms) {
        return cmsRepository.save(cms);
    }

    public boolean deleteCMS(String id) {
        try {
            cmsRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
