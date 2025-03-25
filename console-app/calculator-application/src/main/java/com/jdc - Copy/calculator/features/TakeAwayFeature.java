package com.jdc.calculator.features;

public class TakeAwayFeature extends AbstractCalculationFeature {

	public TakeAwayFeature() {
		super(1, "Substract");
	}

	@Override
	public void calculate(int d1, int d2) {
		System.out.println("%d - %d is %d".formatted(d1, d2, d1 - d2));		
	}

}