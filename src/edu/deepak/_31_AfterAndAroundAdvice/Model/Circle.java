package edu.deepak._31_AfterAndAroundAdvice.Model;

public class Circle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle setter is called");
	}
	
}
