package com.jdc.exe.strategy.payment;

public class Kpay extends MobilePay{

	public Kpay(String username,String phoneNumber){
		this.username = username;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public void pay(int amount){
		System.out.println("""
								%d is paid using Kpay.
								Kpay number : %s
								Kpay name: %s"""
								.formatted(amount,phoneNumber,username)
								);
	}
}