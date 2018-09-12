package edu.deepak._34_AopXmlConfiguration.Model;

public class Triangle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		// System.out.println("Triangle setter is called");
		throw (new RuntimeException());
	}

	public String setNameAndReturn(String name) {
		this.name = name;
		// System.out.println("Triangle setter is called");
		return name;
	}

}
