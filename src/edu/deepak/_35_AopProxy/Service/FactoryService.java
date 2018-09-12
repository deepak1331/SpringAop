package edu.deepak._35_AopProxy.Service;

import edu.deepak._35_AopProxy.Model.Circle;
import edu.deepak._35_AopProxy.Model.Triangle;

public class FactoryService {

	public Object getBean(String beanType) {
		Object obj = null;
		switch (beanType) {
		case "shapeService":
			obj = new ShapeServiceProxy();
			break;

		case "circle":
			obj = new Circle();
			break;

		case "triangle":
			obj = new Triangle();
			break;

		default:
			obj = null;
			break;
		}
		return obj;
	}
}
