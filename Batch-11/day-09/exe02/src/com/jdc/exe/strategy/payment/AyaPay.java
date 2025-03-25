package com.jdc.exe.strategy.payment;

public class AyaPay extends MobilePay{
	public AyaPay(String username,String phoneNumber){
		this.username = username;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public void pay(int amount){
		System.out.println("""
							%d is paid using AyaPay.
								AyaPay number : %s
								AyaPay name: %s"""
								.formatted(amount,phoneNumber,username)
								);
	}
}