package com.jdc.mkt.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.junit.jupiter.api.Test;

public class B_StreamCreationTest {
	void createGenerateAndIterateTest() {
		// look like higher order function
		int i = 3;// effectively final cause of use in lambda
		System.out.println(IntStream.generate(() -> i).limit(5).sum());
		System.out.println(IntStream.iterate(1, arg -> arg).limit(5).sum());
		System.out.println(LongStream.generate(() -> i).limit(5).sum());
		System.out.println(DoubleStream.generate(() -> i).limit(5).sum());
	}

	void createFromRangeAndRangeClosedTest() {

		System.out.println(IntStream.range(1, 10).sum());
		System.out.println(IntStream.rangeClosed(1, 10).sum());
		System.out.println(LongStream.range(1, 10).sum());
		System.out.println(DoubleStream.of(1.1, 2.4, 4.5).sum());
	}

	@Test
	@SuppressWarnings("unchecked")
	void test() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.stream(array).sum());
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		int a = 30;
		System.out.println(list.stream().mapToInt(e -> a).sum());
	}

}
