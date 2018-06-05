package com.logic.service;

import java.util.List;

import com.logic.dao.LaptopEntity;

public interface LaptopService {

	public String addLaptop(LaptopEntity entity);
	public List<LaptopEntity> getLaptops();
	public int countLaptop();

}
