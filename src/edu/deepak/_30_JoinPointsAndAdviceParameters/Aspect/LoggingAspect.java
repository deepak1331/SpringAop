package edu.deepak._30_JoinPointsAndAdviceParameters.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import edu.deepak._30_JoinPointsAndAdviceParameters.Model.Triangle;

@Aspect
public class LoggingAspect {

	@Before("allCircleMethodUsingWithin()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("Advice run. " + joinPoint.toString() + " method is called");
	}

	@Before("allTriangleMethodUsingWithin()")
	public void loggingAdvice2(JoinPoint joinPoint) {
		System.out.println("Advice 2 run. " + joinPoint.getTarget() + " method is called");
		
		//You can get hold of the target object using joinPoint.getTarget().
//		Triangle triangle = (Triangle)joinPoint.getTarget();
//		System.out.println(triangle.getName());
	}

	@Before("args(String)")
	public void stringArgumentMethod(){
		System.out.println("A method that takes String arg has been called.");
	}
	
	@Before("args(name)")
	public void stringArgumentMethodWithValue(String name){
		System.out.println("A method that takes String arg has been called. Value set was: "+name);
	}
	
	@Pointcut("within(edu.deepak._30_JoinPointsAndAdviceParameters.Model.Circle)")
	public void allCircleMethodUsingWithin() {
	}

	@Pointcut("within(edu.deepak._30_JoinPointsAndAdviceParameters.Model.Triangle)")
	public void allTriangleMethodUsingWithin() {
	}
}