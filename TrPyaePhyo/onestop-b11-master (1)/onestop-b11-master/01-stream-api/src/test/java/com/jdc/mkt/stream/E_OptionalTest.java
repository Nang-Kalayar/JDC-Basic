package com.jdc.mkt.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class E_OptionalTest {
	private Optional <String > getValue (String str){
		//if use (of )method will cause null  pointer exception
		//if use (ofNullabel) method will empty but never be exception 
		return Optional.ofNullable(str);
	}
	
	@Test
	void retriveTest() {
		getValue("Hello").ifPresent(arg ->assertEquals("Hello",arg));
		getValue(null).ifPresentOrElse(a->System.out.println(a),
				()->System.out.println("No param"));
		//if present ,will use present value or else throw given exception
		assertThrows(NoSuchElementException.class,
				()->getValue(null).orElseThrow()-> new NoSuchElementException());
	}
	@Test
	void checkTest() {
		assertTrue(getValue(null).isEmpty());
		assertTrue(getValue("Hello").isPresent());
	}
	
/*@Test
	void test() {
		var opt = getValue("Hello");
		System.out.println(opt);
		Action.doAction();
		Action.doAction("Hello");
	}
	class Action{
		static void doAction(String s1,String s2, String s3) {}
			static void doAction(String s1,String s2) {
			doAction(s1,s2,null);
				
			}
			static void doAction(String s1){
		
	}*/
	

}
