package com.logic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.logic.dao.LaptopDao;
import com.logic.dao.LaptopEntity;

@Service("LaptopServiceImpl")
public class LaptopServiceImpl implements LaptopService {
	
	@Autowired
	@Qualifier("LaptopDaoImpl")
	private LaptopDao laptopDao;
	
	 @Override
	public String addLaptop(LaptopEntity entity) {
		 String result=laptopDao.addLaptop(entity);
		 return result;
	 }
	 
	 @Override
	 public List<LaptopEntity> getLaptops(){
		return  laptopDao.getLaptops();
	 }
	 @Override
	public int countLaptop(){
		return  laptopDao.countLaptop();
	}

}
