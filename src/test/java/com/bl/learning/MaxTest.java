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
	
}
