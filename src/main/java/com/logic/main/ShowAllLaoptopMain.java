package com.logic.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.logic.dao.LaptopEntity;
import com.logic.service.LaptopService;

public class ShowAllLaoptopMain {	
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new  ClassPathXmlApplicationContext("laptop-app.xml");
		//LaptopDao laptopDao=(LaptopDao)applicationContext.getBean("LaptopDaoImpl");
		LaptopService laptopService=(LaptopService)applicationContext.getBean("LaptopServiceImpl");
		 List<LaptopEntity> list=laptopService.getLaptops();
		 list.forEach(item->{
			 System.out.println(item);
		 });
	}
}
