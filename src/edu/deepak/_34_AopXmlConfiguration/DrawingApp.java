package edu.deepak._34_AopXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.deepak._34_AopXmlConfiguration.Service.ShapeService;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring34.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		shapeService.getCircle();
	}

}
