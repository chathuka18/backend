package com.ceyline.group.service;

import com.ceyline.group.model.CWS;
import com.ceyline.group.repo.CWSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CWSService {
    @Autowired
    private CWSRepository cwsRepository;

    public List<CWS> getAllCWS() {
        return cwsRepository.findAll();
    }

    public CWS createCWS(CWS cws) {
        return cwsRepository.save(cws);
    }

    public boolean deleteCWS(String id) {
        try {
            cwsRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
