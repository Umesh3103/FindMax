package com.bl.learning;

public class MaximumTest<E extends Comparable<E>> {
	public static void main(String[] args) {
		System.out.println("welcome to find max problem");
	}
	
	E x, y, z;
	E[] elements;
	
	public MaximumTest(E x, E y, E z, E... elements) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.elements=elements;
	}
	public String findMax(){
		return findMax(x,y,z,elements);
	}
	public static <E extends Comparable<E>> String findMax(E x, E y, E z, E... elements){
		E max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		if(elements.length!=0){
			max=findOptional(max,elements);
		}
		return ""+max;
	}
	private static <E extends Comparable<E>> E findOptional(E max, E[] elements) {
		for(E entry: elements){
			if(entry.compareTo(max)>0){
				max=entry;
			}
		}
		return max;
	}
}
