package com.ceyline.group.service;

import com.ceyline.group.model.CSV;
import com.ceyline.group.repo.CSVRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSVService {
    @Autowired
    private CSVRepository csvRepository;

    public List<CSV> getAllCSV() {
        return csvRepository.findAll();
    }

    public CSV createCSV(CSV csv) {
        return csvRepository.save(csv);
    }

    public boolean deleteCSV(String id) {
        try {
            csvRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
