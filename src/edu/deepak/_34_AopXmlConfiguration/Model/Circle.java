package edu.deepak._34_AopXmlConfiguration.Model;

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
