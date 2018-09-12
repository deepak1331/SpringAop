package edu.deepak._28_PointCuts_Wildcard;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.deepak._28_PointCuts_Wildcard.Service.ShapeService;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring28.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		System.out.println(shapeService.getCircle().getName());
		System.out.println(shapeService.getTriangle().getName());
	}

}
