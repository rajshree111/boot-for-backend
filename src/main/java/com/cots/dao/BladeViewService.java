package com.cots.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cots.model.BladeView;
import com.cots.repository.BaldeViewRepository;

@Service
public class BladeViewService {

	
	 @Autowired
	 private BaldeViewRepository baldeViewRepository;
	 
	 
	 public void setBladeViewById(List<BladeView> bladeView) {
		 baldeViewRepository.save(bladeView);
		 
	 }
	 
	 
	 public void add(BladeView bladeView) {
		 System.out.println("##############################################going to save for blade id"+bladeView.getBladeId());
		 baldeViewRepository.save(bladeView);
	 }
	 public List<BladeView> getAllbladeDetails() {
		 return baldeViewRepository.findAll();
	 }
	 
	 public BladeView getBladeById(int bladeId) {
		 return baldeViewRepository.findBladeViewByBladeId(bladeId);
	 }
	 
	 public void deleteBladeById(int bladeId) {
		 baldeViewRepository.delete(bladeId);
	 }
}
