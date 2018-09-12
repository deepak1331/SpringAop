package edu.deepak._28_PointCuts_Wildcard.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
 * @Aspect annotation makes any class a ASpect class
 * All its member method will be called as advice.
 */
@Aspect
public class LoggingAspect {

	
	
	@Pointcut("execution(* get*())")
	public void allGetters() {
	}
	
//	We can use this pointcut instead of the long expression.
	
//	@Before("execution(public * get*())")
	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("Advice ran. Get Method is called.");
	}
	
//	@Before("execution(public * get*())")
	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("Second Advice ran. Get Method is called.");
	}
	
	// Applicable only on Circle class getName()
	// @Before("execution(public String
	// edu.deepak._28_PointCuts_Wildcard.Model.Circle.getName())")
	// public void loggingAdvice(){
	// System.out.println("Advice ran. Get Method is called.");
	// }

	// Any class having String getName() method signature
	// @Before("execution(public String getName())")
	// public void loggingAdviceAll(){
	// System.out.println("Advice ran. Get Method is called.");
	// }

	// Any public method which start with get, which doesn't take any argument.
	

	// Any public method which start with get, which does take one or more number of argument.
	// @Before("execution(public * get*(*))")
	// public void loggingAdvice() {
	// System.out.println("Advice ran. Get Method is called.");
	// }
		
	// Any public method which start with get,which takes any no of argument or
	// even without any argument.
	// @Before("execution(public * get*(..))")
	// public void loggingAdviceAll(){
	// System.out.println("Advice ran. Get Method is called.");
	// }
}
