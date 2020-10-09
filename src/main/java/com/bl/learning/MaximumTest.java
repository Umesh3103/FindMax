package com.bl.learning;

public class MaximumTest {
	public static void main(String[] args) {
		System.out.println("welcome to find max problem");
	}
	
	public static <E extends Comparable<E>> String findMax(E x, E y, E z){
		E max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return ""+max;
	}
}
