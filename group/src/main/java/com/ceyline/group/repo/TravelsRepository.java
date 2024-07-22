package com.ceyline.group.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ceyline.group.model.Travel;

public interface TravelsRepository extends JpaRepository<Travel, String> {
}
