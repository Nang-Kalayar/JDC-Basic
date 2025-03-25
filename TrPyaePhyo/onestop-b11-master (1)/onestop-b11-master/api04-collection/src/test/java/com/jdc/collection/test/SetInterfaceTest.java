package com.jdc.collection.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

public class SetInterfaceTest {
	@Test
	void test_for_linked_hash_set() {
		var lhs = new LinkedHashSet<Integer>();
		Collections.addAll(lhs,20,4,51,8,30,44,12);
		lhs.addFirst(100);
		assertEquals(8,lhs.size());
		lhs.addLast(34);
		assertEquals(9,lhs.size());
		
		assertEquals(100,lhs.getFirst());
		assertEquals(34,lhs.getLast());
		
		assertEquals(100,lhs.removeFirst());
		assertEquals(34,lhs.removeLast());
		
		assertEquals(20,lhs.getFirst());
		assertEquals(12,lhs.getLast());
		assertEquals(7,lhs.size());
		System.out.println(lhs);
		
	}
}
		

	/*
	@Test
	void test_for_tree_set() {
		var ts = new TreeSet<Integer>();
		Collections.addAll(ts,20,4,51,8,30,44,12 );
		assertEquals(7,ts.size());
		assertThrows(UnsupportedOperationException.class,()->ts.addFirst(100));
		
		assertEquals(30,ts.celling(21));//greater than or equal
		assertEquals(4,ts.first());//less than or equal
		assertEquals(51,ts.last());
		assertEquals(12,ts.floor(12));
		assertEquals(11,ts.floor(11));
		
		assertEquals(12,ts.higher(12));//not contain equal ,greater  than
		assertEquals(11,ts.lower(11));//less than
		
		System.out.println(ts.headSet(30,true));
		System.out.println(ts.tailSet(30,false));
		System.out.println(ts.descendingSet());
		
		
		System.out.println(ts);
		System.out.println(ts.subSet(8, false,44,true));
		
		
	}
	void test_for_hash_set() {
		Set<Integer> hs = new HashSet<>();
		assertTrue(hs,add(4));
		assertTrue(hs,add(2));
		assertTrue(hs,add(9));
		assertTrue(hs,add(1));
		assertTrue(hs,add(3));
		
		assertEquals(5,hs.size());
		assertFalse(hs.add(1));
		assertEquals(5,hs.size());
		assertTrue(hs.add(null));
		assertEquals(6,hs.size());
		assertTrue(hs.contains(1));
		assertFalse(hs.contains(6));
		assertTrue(hs.remove(null));
		assertEquals(5,hs.size());
		
		Predicate<Integer> pred = new Predicate<Integer> () {
			@Override
			public boolean test(Integer t) {
				return t < 3;
			};
			assertTrue(hs.removeIf(pred));
			assertEquals(3,hs.size());
			assertTrue(hs.removeAll(Set.of(4,9,7)));
			assertEquals(1,hs.size());
			
			Collections.addAll(hs, 5,7,4,2,9,6);
			assertEquals(7,hs.size());
			
			System.out.println(hs.retainAll(Set.of(1,2,3,4)));
		System.out.println(hs);
		hs.clear();
		assertEquals(0,hs.size());
		
	}
	*/


