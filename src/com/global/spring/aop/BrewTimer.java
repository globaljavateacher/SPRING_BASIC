package com.global.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class BrewTimer {
	public Object  check(ProceedingJoinPoint joinPoint) throws Throwable {
		long s = System.nanoTime();		
		Object result = joinPoint.proceed();		
		long e = System.nanoTime();
		System.out.printf("Brew Time: %d ms", (e - s) / 1_000_000);		
		return result;		
	}
}

