package com.global.spring.aop;

public class Starbucks {
	public void brew() throws InterruptedException {
		System.out.println("Starbucks.makeCoffee");
		Thread.sleep(3000);
	}
}
