package edu.deepak._35_AopProxy.Service;

import edu.deepak._35_AopProxy.Service.ShapeService;
import edu.deepak._35_AopProxy.Aspect.LogginAspect;
import edu.deepak._35_AopProxy.Model.Circle;

public class ShapeServiceProxy extends ShapeService {

	public Circle getCircle() {
		System.out.println("Called from ShapeServiceProxy");
		new LogginAspect().loggingAdvice();
		return super.getCircle();
	}
}
