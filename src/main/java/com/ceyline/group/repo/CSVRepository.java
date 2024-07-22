package com.ceyline.group.repo;

import com.ceyline.group.model.CSV;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CSVRepository extends JpaRepository<CSV, String> {
}
