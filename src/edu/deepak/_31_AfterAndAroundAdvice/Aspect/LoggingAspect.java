package edu.deepak._31_AfterAndAroundAdvice.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@After acts similar to @Before, but its run after the method is executed, whether the method runs successfully or not

@Aspect
public class LoggingAspect {

	@Before("args(name)")
	public void loggingAdvice(String name) {
		System.out.println("\nA method that takes String argument has been called.\nValue assigned is: " + name);
	}

	@Pointcut("within(edu.deepak._31_AfterAndAroundAdvice.Model.Circle)")
	public void allGetters() {
	}

//	@After("within(edu.deepak._31_AfterAndAroundAdvice.Model.*)")
//	public void loggigAdviceAfter() {
//		System.out.println("Method execution completed.");
//	}

	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void exceptionAdvice(String name, Object returnString) {
		// System.out.println("\nA method that takes String argument has been
		// called.\nValue assigned is: " + name);
		System.out.println("The output value is : " + returnString.toString());
	}

	// @AfterReturning("args(name)")
	// public void testAdvice(String name) {
	// System.out.println("\nA method that takes String argument has been
	// called.\nValue assigned is: " + name);
	// }

	// Also called as After Finally
	@AfterThrowing("args(name)")
	public void exceptionAdvice(String name) {
		System.out.println("\nAn exception occurred");
	}

	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void exceptionAdvice2(String name, Object ex) {
		System.out.println("Exception thrown : " + ex.toString());
	}

}