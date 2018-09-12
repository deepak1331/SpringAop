package edu.deepak._28_PointCuts_Wildcard.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
 * @Aspect annotation makes any class a ASpect class
 * All its member method will be called as advice.
 * 
 * Execution -  takes  method as parameters
 * Within - takes class/packages as parameters 
 * Args - arguments ur method gonna have for which u want to apply pointcut.
 
 * BestPractice while writing pointcut
 * Mix n match n combine pointcut expressions 
 */
@Aspect
public class SecurityAspect {

	@Before("allGetters() && allCircleMethods()")
	public void securityAdvice() {
		System.out.println("Security Advice Runs. Get Method called.");
	}

	@Pointcut("execution(* get*(..))")
	public void allGetters() {
	}

	@Pointcut("within(edu.deepak._28_PointCuts_Wildcard.Model.Circle)")
	public void allCircleMethods() {
	}

}
