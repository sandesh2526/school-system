package com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution(public String getName())")
	public void loggingAdvice() {
		System.out.println("THE ADVICE IS EXECUTED!");
	}
	
	@After("execution(public String getName())")
	public void loggingAdvice2() {
		System.out.println("THE ADVICE IS EXECUTED!");
	}
}