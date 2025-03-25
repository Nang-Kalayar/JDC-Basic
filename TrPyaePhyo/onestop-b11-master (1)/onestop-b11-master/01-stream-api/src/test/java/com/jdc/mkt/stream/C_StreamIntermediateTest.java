package com.jdc.mkt.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class C_StreamIntermediateTest {
	private List<String> list1= List.of("8","2","3","6","7"," ","","4","9","5","10","1","4","10");
	private List<String> list2= List.of("9","4","10");
	@Test
	void testTwo() {
		Stream.of(list1,list2)
		.flatMap(es->es.stream())//collection stream to element stream
		.filter(e->!e.isBlank())//not contain blank element
		.map(str->str +",")//generic type return
		.map(str->Integer.parseInt(str))
		.sorted()
		.filter(i-> i %2 ==0)
		.distinct()
		
		.forEach(e->System.out.println(e));
		
	}
	
	//@Test
	void testOne() {
		list1.stream().filter(str->!str.isEmpty())//to prevent empty or white space
		.distinct()//to remove duplicate 
		
		.limit(5)// use 5 elements
		.mapToInt(e->Integer.parseInt(e))
		.sorted()//can sort both integer or string, order by asc
		.skip(2)//skip first 2 elements
		.filter(i-> i %3 ==0)
		.forEach(e->System.out.println(e));
		
		
	}
}
