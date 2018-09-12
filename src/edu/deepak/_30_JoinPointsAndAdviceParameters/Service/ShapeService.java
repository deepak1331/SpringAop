package edu.deepak._30_JoinPointsAndAdviceParameters.Service;

import edu.deepak._30_JoinPointsAndAdviceParameters.Model.Circle;
import edu.deepak._30_JoinPointsAndAdviceParameters.Model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;

	public Circle getCircle() {
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
