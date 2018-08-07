//to perform addition function of the calculator

package in.co.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

import org.junit.jupiter.api.Test;



public class testAddition {

	@Test
	public void testAdditionTwoPositive() //when both numbers are positive
	{
	  Maths math = new Maths();
	  int ans = math.add(2,2);
	  Assert.assertEquals(4, ans);
	}
	
	@Test
	public void testAdditionTwoNegative() //when both numbers are negative
	{
	  Maths math = new Maths();
	  int ans = math.add(-3,-5);
	  Assert.assertEquals(-8, ans);
	}
	
	@Test
	public void testAdditionNegativeGreaterPositive() //when positive number is greater than negative
	{
	  Maths math = new Maths();
	  int ans = math.add(-3,8);
	  Assert.assertEquals(5, ans);
	}
	
	@Test
	public void testAdditionPositiveGreaterNegative() //when negative number is greater than positive
	{
	  Maths math = new Maths();
	  int ans = math.add(-12,3);
	  Assert.assertEquals(-9, ans);
	}
	
	public void testAdditionBothZeros() //when both are zeros
	{
	  Maths math = new Maths();
	  int ans = math.add(0,0);
	  Assert.assertEquals(0, ans);
	}

}
