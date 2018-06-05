package com.logic.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.logic.dao.LaptopEntity;
import com.logic.service.LaptopService;

public class SaveLaoptopMain {	
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new  ClassPathXmlApplicationContext("laptop-app.xml");
		//LaptopDao laptopDao=(LaptopDao)applicationContext.getBean("LaptopDaoImpl");
		LaptopService laptopService=(LaptopService)applicationContext.getBean("LaptopServiceImpl");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scanner.next();
		System.out.println("Enter the ram");
		String ram=scanner.next();
		System.out.println("Enter the color");
		String color=scanner.next();
		System.out.println("Enter the screen size");
		String screen=scanner.next();
		LaptopEntity entity=new LaptopEntity();
		entity.setName(name);
		entity.setRam(ram);
		entity.setColor(color);
		entity.setScreen(screen);
		String result=laptopService.addLaptop(entity);
		System.out.println("Result is coming from dao  = "+result);
		
	}

}
