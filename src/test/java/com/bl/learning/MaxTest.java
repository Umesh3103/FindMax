package com.bl.learning;

import org.junit.Test;

import org.junit.Assert;;

public class MaxTest {
	
	@Test
	public void GivenIntegerFirstPosition_UsingGenerics_ShouldReturnTrue(){
		String result = MaximumTest.findMax(3,2,1);
		Assert.assertEquals("3", result);
	}
	@Test
	public void GivenIntegerSecondPosition_UsingGenerics_ShouldReturnTrue(){
		String result = MaximumTest.findMax(2,3,1);
		Assert.assertEquals("3", result);
	}
	@Test
	public void GivenIntegerThirdPosition_UsingGenerics_ShouldReturnTrue(){
		String result = MaximumTest.findMax(1,2,3);
		Assert.assertEquals("3", result);
	}
	@Test
	public void GivenFloatFirstPosition_UsingGenerics_ShouldReturnTrue(){
		String result = MaximumTest.findMax(3.0f,2.0f,1.0f);
		Assert.assertEquals("3.0", result);
	}
	@Test
	public void GivenFloatSecondPosition_UsingGenerics_ShouldReturnTrue(){
		String result = MaximumTest.findMax(2.0f,3.0f,1.0f);
		Assert.assertEquals("3.0", result);
	}
	@Test
	public void GivenFloatThirdPosition_UsingGenerics_ShouldReturnTrue(){
		String result = MaximumTest.findMax(1.0f,2.0f,3.0f);
		Assert.assertEquals("3.0", result);
	}
	@Test
	public void GivenStringFirstPosition_UsingGenerics_ShouldReturnTrue(){
		String result = MaximumTest.findMax("Peach","Apple","Banana");
		Assert.assertEquals("Peach", result);
	}
	@Test
	public void GivenStringSecondPosition_UsingGenerics_ShouldReturnTrue(){
		String result = MaximumTest.findMax("Apple","Peach","Banana");
		Assert.assertEquals("Peach", result);
	}
	@Test
	public void GivenStringThirdPosition_UsingGenerics_ShouldReturnTrue(){
		String result = MaximumTest.findMax("Banana","Apple","Peach");
		Assert.assertEquals("Peach", result);
	}
}
