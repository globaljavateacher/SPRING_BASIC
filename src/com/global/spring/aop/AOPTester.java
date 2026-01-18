package com.global.spring.aop;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTester {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("com/global/spring/aop/applicationContext.xml");
			System.out.println(context);
			Starbucks starbucks = context.getBean("starbucks", Starbucks.class);
			System.out.println(starbucks);
			starbucks.brew();
		} catch (BeansException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			context.close();
		}
	}
}
