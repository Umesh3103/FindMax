package com.bl.learning;

import org.junit.Test;

import org.junit.Assert;;

public class MaxTest {
	
	@Test
	public void GivenIntegerFirstPosition_UsingGenerics_ShouldReturnTrue(){
		String result = new MaximumTest(3,2,1).findMax();
		Assert.assertEquals("3", result);
	}
	@Test
	public void GivenIntegerSecondPosition_UsingGenerics_ShouldReturnTrue(){
		String result = new MaximumTest(2,3,1).findMax();
		Assert.assertEquals("3", result);
	}
	@Test
	public void GivenIntegerThirdPosition_UsingGenerics_ShouldReturnTrue(){
		String result =new MaximumTest(1,2,3).findMax();
		Assert.assertEquals("3", result);
	}
	@Test
	public void GivenFloatFirstPosition_UsingGenerics_ShouldReturnTrue(){
		String result = new MaximumTest(3.0f,2.0f,1.0f).findMax();
		Assert.assertEquals("3.0", result);
	}
	@Test
	public void GivenFloatSecondPosition_UsingGenerics_ShouldReturnTrue(){
		String result = new MaximumTest(2.0f,3.0f,1.0f).findMax();
		Assert.assertEquals("3.0", result);
	}
	@Test
	public void GivenFloatThirdPosition_UsingGenerics_ShouldReturnTrue(){
		String result = new MaximumTest(1.0f,2.0f,3.0f).findMax();
		Assert.assertEquals("3.0", result);
	}
	@Test
	public void GivenStringFirstPosition_UsingGenerics_ShouldReturnTrue(){
		String result =new MaximumTest("Peach","Apple","Banana").findMax();
		Assert.assertEquals("Peach", result);
	}
	@Test
	public void GivenStringSecondPosition_UsingGenerics_ShouldReturnTrue(){
		String result = new MaximumTest("Apple","Peach","Banana").findMax();
		Assert.assertEquals("Peach", result);
	}
	@Test
	public void GivenStringThirdPosition_UsingGenerics_ShouldReturnTrue(){
		String result = new MaximumTest("Apple","Banana","Peach").findMax();
		Assert.assertEquals("Peach", result);
	}
	@Test
	public void GivenManyIntegers_UsingGenerics_ShouldReturnTrue(){
		String result = new MaximumTest(3,2,1,5,10).findMax();
		Assert.assertEquals("10", result);
	}
	@Test
	public void GivenManyFloats_UsingGenerics_ShouldReturnTrue(){
		String result = new MaximumTest(3.0f,2.0f,1.0f,4.0f,7.0f,9.0f).findMax();
		Assert.assertEquals("9.0", result);
	}
	@Test
	public void GivenManyStrings_UsingGenerics_ShouldReturnTrue(){
		String result = new MaximumTest("Apple","Peach","Banana","Zebra","Elephant").findMax();
		Assert.assertEquals("Zebra", result);
	}
}
