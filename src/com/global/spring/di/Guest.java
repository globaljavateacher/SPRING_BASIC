package com.global.spring.di;

public class Guest {
	Money money;
	Coffee coffee;
	String memberId;
	Guest(Money money){
		this.money = money;
	}
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
}
