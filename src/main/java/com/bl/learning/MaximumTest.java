package com.bl.learning;

public class MaximumTest<E extends Comparable<E>> {
	public static void main(String[] args) {
		System.out.println("welcome to find max problem");
	}
	
	E x, y, z;
	
	public MaximumTest(E x, E y, E z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String findMax(){
		return findMax(x,y,z);
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
