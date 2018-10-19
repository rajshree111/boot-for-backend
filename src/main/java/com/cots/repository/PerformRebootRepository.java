package com.cots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cots.model.PerformReboot;

public interface PerformRebootRepository extends JpaRepository<PerformReboot, Integer>{
	public PerformReboot findPerformRebootByBladeId(int bladeId);

}

