package com.jdc.lambda.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

public class FunctionalInterfaceTest {
	record Payload (String name,LocalDate issueAt) {
		
	}
	
	@Test
	void test_for_supplier() {
		Supplier<String> stringSup = ()-> "Hello Supplier.";
		assertEquals("Hello Supplier", stringSup);
		Supplier<Payload> plSup =()-> new Payload("Request",LocalDate.now());
		var payload = plSup.get();
		assertEquals("Request",payload.name());
		//assertEquals("Request",plSup.get().name());
		
	}
	@Test
	void test_for_predicate() {
		Predicate<Integer> evenPred = i -> i %2 ==0;
		Predicate<Integer> oddPred = evenPred.negate();
		Predicate<Integer> greaterThan50 = i -> i>50;
		Predicate<Integer> pred = oddPred.and(greaterThan50);
		assertTrue(pred.test(51));
		assertFalse(pred.test(100));
	}
	@Test
	void test_for_function() {
		//Integer apply (String t);
		Function<String,Integer> strToInt = str ->Integer.parseInt(str);
		assertEquals(10,strToInt.apply("10"));
		Function<Integer,String> intToStr = i-> String.valueOf(i);
		assertEquals("10",intToStr.apply(10));
		
		Function<Integer,Integer> intToInt = i-> i;
		assertEquals(10,intToInt.apply(10));
		Function<String,String> strToStr = str->"Hello".concat(str);
		assertEquals("Hello",strToStr.apply("Hello Consumer"));
		
		Function<Integer,Integer> twice = i ->i *2;
		Function<Integer,Integer> square = i -> i * i;
		int result1 = twice.andThen(twice).andThen(square).apply(2);
		assertEquals(64,result1);
		
		int result2 = square.compose(twice).compose(twice).apply(2);
		assertEquals(16,result2);
		
		int result3 = square.andThen(twice).compose(twice).andThen(twice).compose(square).apply(2);
		assertEquals(256,result3);
		
		
		
	}
	@Test
	void test_for_consumer() {
		//strCon =(String str) ->System.out.println(str)
		Consumer<String> strCon =System.out::print;
		strCon.accept("Hello from consumer");
		
		List<Integer> list = List.of(1,2,3,4,5);
		for(Integer i :list) {
			System.out.println(i + ",");
		}
		list.forEach(i->System.out.print(i + ","));
		System.out.println();
		list.forEach(System.out::print);
		
		Consumer<String> c1 = str -> System.out.println("c1->"+ str);
		Consumer<String> c2 = str -> System.out.println("c2->"+ str);
		
		c1.andThen(c2).andThen(c1).accept("Consumer");
				

	}
}
