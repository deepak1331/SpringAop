package edu.deepak._35_AopProxy.Service;

import edu.deepak._35_AopProxy.Model.Circle;
import edu.deepak._35_AopProxy.Model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;

	public Circle getCircle() {
		System.out.println("Circle getter called.");
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
		
	}
}