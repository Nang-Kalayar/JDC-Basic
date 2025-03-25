package com.jdc.exe.strategy.payment;

public class MasterCard extends CreditCard{

	 public VisaCard(String cardNumber, String cvcNumber,String holderName){
	 	this.cardNumber = cardNumber;
	 	this.cvcNumber = cvcNumber;
	 	this.holderName = holderName;
	 }
	 @Override
	public void pay(int amount){
		System.out.println("""
							%d is paid using MasterCard.
							 CardNumber: %s
							CVCNumber: %s
							HolderName: %s"""
							.formatted(amount,cardNumber,cvcNumber,holderName)
								);
	}