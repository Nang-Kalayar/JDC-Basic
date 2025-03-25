package com.jdc.mkt.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class D_StreamTerminalTest {
	private List<String> list1= List.of("8","2","3","6","7"," ","","4","9","5","10","1","4","10");
	private List<String> list2= List.of("9","4","10");
	@Test
	void collectTest() {
		var res =list1.stream()
		.filter(e->!e.isBlank())
		.mapToInt(i ->Integer.parseInt(i))
		.distinct()
		.sorted()
		.reduce((a,b)->a + b);
		System.out.println(res);
	}
	
	@Test
	void resultTest() {
		var opt1 = list1.stream().parallel()
				.findAny();
		opt1.ifPresentOrElse(
				a->System.out.println(a),
				//use given value when there is no value
				()->System.out.println("Empty")
				);
		var opt2 = list2.stream().parallel()
				.findAny();
		opt2.ifPresentOrElse(
				a->System.out.println(a),
				//use given value when there is no value
				()->System.out.println("Empty")
				);
		
	}
	//@Test
	void checkingTest() {
		var res = list2.stream()
				.mapToInt(e->Integer.parseInt(e))
				//.allMatch(i->i <=10);//true
				//.anyMatch(i ->i<=9);//true
				.noneMatch(i->i==5);//false
			System.out.println(res);
		
		
	}
	//@Test
	void iterateTest() {
		//if use forEachOrdered for parallel processing with sorted
		//can't sorted in parallel processing with forEach
		list1.stream()
		.filter(s->!s.isBlank())
		.mapToInt(i->Integer.parseInt(i))
		.sorted()
		.parallel()
		.forEachOrdered(s->System.out.println(s));
		
	}

}
