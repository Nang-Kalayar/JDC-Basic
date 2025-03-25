package com.jdc.mkt.stream;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class A_BeforeAndAfterStreamTest {
	private List <Integer> li = List.of(1,2,3,4,5,6,7,8,9);
	@Test
	@Order(2)
	void withStreamTest() {
		System.out.println(
				"With steam result:"
				+list.stream().parallel().mapToInt(e->e).sum()
				);
	}
	private List<Integer> list = List.of(1,2,3,4,5,6);
	@Test
	@Order(1)
	
	void beforeStreamTest() {
		var itr = list.iterator();
		var result =0; 
		while(itr.hasNext()) {
			result += itr.next();
	
		
	}System.out.println("Sum result :" + result);
		

}
}
