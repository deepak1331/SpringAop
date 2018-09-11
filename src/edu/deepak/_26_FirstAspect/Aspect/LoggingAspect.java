package edu.deepak._26_FirstAspect.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 * @Aspect annotation makes any class a ASpect class
 * All its member method will be called as advice.
 */
@Aspect
public class LoggingAspect {

	@Before("execution(public String getName())")
	public void loggingAdvice(){
		System.out.println("Advice ran. Get Method is called.");
	}
	
//	@Before("execution(public void setName(String name))")
//	public void loggingAdvice2(){
//		System.out.println("Advice ran. Set method is called");
//	}
}
