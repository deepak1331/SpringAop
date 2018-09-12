package edu.deepak._35_AopProxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.deepak._35_AopProxy.Service.FactoryService;
import edu.deepak._35_AopProxy.Service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring34.xml");
//		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
//		shapeService.getCircle();
		
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService)factoryService.getBean("shapeService");
		shapeService.getCircle();
	}

}
