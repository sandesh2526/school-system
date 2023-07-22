package com.aspect;

import java.io.FileWriter;
import java.util.Arrays;

import com.model.Student;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("getMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("[ "+joinPoint.getSignature().getDeclaringType() + " ] successfully ");
	}

	@After("getMethods()")
	public void loggingAdvice2() {
		System.out.println("THE ADVICE IS EXECUTED!");
	}

	@Before("execution(* com.model.*.add*(..))")
	public void logAddMethod(JoinPoint joinPoint) {
		Object[] objects = joinPoint.getArgs();
		String classOf = objects[0].toString();
		System.out.println("Added "+classOf.split("\\(")[0]);
	}
	
	
	
	@Before("args(com.model.Student)")
	public void methodHavingArgumentAsStudent() { 
		System.out.println("The type of the argument is Student");
	}
	
	@Before("(allMethodsInsideTheStudent() && getMethods())")
	public void allGetMethodsInsideStudentl() {
		System.out.println("executing a get method inside the School");		
	}
	
	@Pointcut("within(com.model.Student)")
	public void allMethodsInsideTheStudent() {}
		
	@Pointcut("execution(* get*())")
	public void getMethods() {}
}