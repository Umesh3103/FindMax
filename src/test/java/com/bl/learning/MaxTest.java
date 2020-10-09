package com.bl.learning;

import org.junit.Test;

import org.junit.Assert;;

public class MaxTest {
	
	@Test
	public void GivenInteger_AtFirstPosition_ShouldReturnTrue(){
		String result = MaximumTest.findMax(3, 2, 1);
		Assert.assertEquals("3", result);
	}
	@Test
	public void GivenInteger_AtSecondPosition_ShouldReturnTrue(){
		String result = MaximumTest.findMax(2, 3, 1);
		Assert.assertEquals("3", result);
	}
	@Test
	public void GivenInteger_AtThirdPosition_ShouldReturnTrue(){
		String result = MaximumTest.findMax(1, 2, 3);
		Assert.assertEquals("3", result);
	}
	@Test
	public void GivenFloat_AtFirstPosition_ShouldReturnTrue(){
		String result = MaximumTest.findMaxFloat(3.0f,2.0f,1.0f);
		Assert.assertEquals("3.0", result);
	}
	@Test
	public void GivenFloat_AtSecondPosition_ShouldReturnTrue(){
		String result = MaximumTest.findMaxFloat(2.0f, 3.0f, 1.0f);
		Assert.assertEquals("3.0", result);
	}
}
