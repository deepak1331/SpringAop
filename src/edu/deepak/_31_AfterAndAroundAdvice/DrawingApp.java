package edu.deepak._31_AfterAndAroundAdvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.deepak._31_AfterAndAroundAdvice.Service.ShapeService;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring31.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		// shapeService.getCircle().setName("Concentric Circle");
		// System.out.println(shapeService.getCircle().getName());
		shapeService.getCircle().getName();
		// shapeService.getTriangle().setName("Equilateral Triangle");
		// shapeService.getTriangle().setNameAndReturn("Obtuse Angle Triangle");
		
		shapeService.getTriangle().testMethod();
	}

}
