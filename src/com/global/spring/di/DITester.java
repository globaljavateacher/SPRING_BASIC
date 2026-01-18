package com.global.spring.di;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITester {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("com/global/spring/di/applicationContext.xml");
			System.out.println(context);
			Guest guest = context.getBean("guest", Guest.class);
			System.out.println(guest.money);
			System.out.println(guest.coffee);
			System.out.println(guest.memberId);
		} catch (BeansException e) {
			e.printStackTrace();
		} finally {
			context.close();
		}
	}
}
