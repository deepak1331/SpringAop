package edu.deepak._34_AopXmlConfiguration.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	public Object myAroundAdviceWithReturnType(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnVal = null;
		try {
			System.out.println("Before advice");
			returnVal = proceedingJoinPoint.proceed();
			System.out.println("After advice");
		} catch (Throwable e) {
			System.out.println("After throwing");
			e.printStackTrace();
		}
		System.out.println("After Finally");
		return returnVal;
	}
}