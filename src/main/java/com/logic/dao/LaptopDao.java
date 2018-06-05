package com.logic.dao;

import java.util.List;

public interface LaptopDao {

	public String addLaptop(LaptopEntity entity);
	public List<LaptopEntity> getLaptops();
	public int countLaptop();

}
