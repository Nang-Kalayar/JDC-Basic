package com.jdc.lambda;
@FunctionalInterface
public interface Calculable {
	int calculate (int a,int b);
	boolean equals(Object obj);
	String toString();
	int hashCode();

}
