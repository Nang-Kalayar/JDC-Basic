package com.jdc.collection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.jdc.collection.NoteBook;

public class CollectionUtilityTest  {
	@Test
	void test_for_immutable_collection() {
		var list = new ArrayList<Integer>();//mutable type
		Collections.addAll(list,1,2,3,4,5);
		var ofList = List.of(1,2,3,4,5);//immutable type
		var umList = Collections.unmodifiableCollection(list);//immutable type
		var asList = Arrays.asList(1,2,3,4,5);
		asList.set(2, 10);
	}
	@Test
	void test_for_sort_notebook() {
		var nb1 = new NoteBook(1,"Zen Book","Asus",16,1000000);
		var nb2 = new NoteBook(2,"Lattitude","Dell",8,7000000);
		var nb3 = new NoteBook(3,"Pro Book","HP",16,90000000);
		var nb4 = new NoteBook(4,"Surface Pro","MicroSoft",32,1500000);
		var nb5 = new NoteBook(5,"Mac Book Pro","Apple",8,30000000);
		
		var list =new ArrayList<NoteBook>(List.of(nb1,nb2,nb3,nb4,nb5));
		//List.sort(null);occur runtime error
		Collections.sort(list,new NameAsComparator());
		
		System.out.println(list);
		
	}
	@Test
	void test() {
		List<String> list = new ArrayList<String>();
		list.add("A of Heart");
		list.add("1 of Heart");
		list.add("3 of Heart");
		list.add("10 of Heart");
		list.add("J of Heart");
		list.add("4 of Heart");
		list.add("9 of Heart");
		list.add("5 of Heart");
		list.add("7 of Heart");
		list.add("8 of Heart");
		list.add("2 of Heart");
		list.add("K of Heart");
		list.add("Q of Heart");
		list.add("6 of Heart");
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		
		
	}

}
