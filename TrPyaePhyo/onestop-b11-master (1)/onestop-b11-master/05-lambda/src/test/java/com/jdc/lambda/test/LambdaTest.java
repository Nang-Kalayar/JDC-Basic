package com.jdc.lambda.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.lambda.Calculable;
import com.jdc.lambda.CanRun;
import com.jdc.lambda.Printable;
class Reference{
	public Reference() {}
	public Reference(String text) {
		System.out.println("%s in constructor.".formatted(text));
	}
	public 
	
}

public class LambdaTest {
	
	@ParameterizedTest
	@ValueSource(Strings = "Method Reference")
	void test_with_method_reference(String value) {
		Printable initP = Reference::new;
		initP.doPrint(value);
		
		Printable stP = Reference::display;
		stP.doPrint(value);
		//instance Reference method
		Printable itP = new Reference():: showText();
		itP.doPrint(value);
		Printable scitP = this::read;
		scitP.doPrint(value);
		
		
		
		
		
	}
	void read(String text) {
		System.out.println("%s in same  class 's instance method.".formatted(text));
	}
}
	@Test
	@ParameterizedTest
	@CsvSource("5,2,10")
	void test_with_lambda(int input1,int input2,int result) {
		Calculable cal = (int a,int b)->{
			return a * b;
		};
		assertEquals(result,cal.calculate(input1,input2));
		
		Printable p = (String text) ->{
			System.out.println(text);
			};
		p.doPrint("Hello from Lambda!");
		
		CanRun cr = ()-> {
			System.out.println("Run from Lambda");
			};
			cr.run();
	}

	@ParameterizedTest
	@CsvSource("10,20,30")
	void test_with_anonymous(int input1,int input2,int result) {
		Calculable cal = new Calculable() {
		@Override
		public int calculate(int a, int b ) {
			return a + b;
		}
	};
	assertEquals(result,cal.calculate(input1,input2));
	
	Printable p = new Printable() {
	@Override
	public void doPrint(String text) {
		System.out.println(text);
	}
	p.doPrint("Hello from anomymous inner class");
	};
	
		
	CanRun cr = new CanRun() {
	@Override
	public void run(String text) {
		System.out.println("Run from lambda");
			}
	};
}
	
	
