package com.cots.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cots.model.BladeView;


public interface BaldeViewRepository extends JpaRepository<BladeView, Integer>{
	public BladeView findBladeViewByBladeId(int bladeId);

}
