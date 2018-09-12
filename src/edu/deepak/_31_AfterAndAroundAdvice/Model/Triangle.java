package edu.deepak._31_AfterAndAroundAdvice.Model;

import edu.deepak._31_AfterAndAroundAdvice.Aspect.Loggable;

public class Triangle {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
//		System.out.println("Triangle setter is called");		
		throw( new RuntimeException());
		}
		
	public String setNameAndReturn(String name){
		this.name = name;
//		System.out.println("Triangle setter is called");		
		return name;
	}
	
	@Loggable
	public void testMethod(){
		System.out.println("test method of triangle");
	}
	
}
