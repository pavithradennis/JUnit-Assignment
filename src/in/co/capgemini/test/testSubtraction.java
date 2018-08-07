//to perform subtraction function of the calculator

package in.co.capgemini.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class testSubtraction {

	@Test
	public void testSubtractTwoPositive() //when both numbers are positive
	{
	  Maths math = new Maths();
	  int ans = math.subtract(9,2);
	  Assert.assertEquals(7, ans);
	}
	
	@Test
	public void testSubtractTwoNegative() //when both numbers are negative
	{
	  Maths math = new Maths();
	  int ans = math.subtract(-3,-5);
	  Assert.assertEquals(2, ans);
	}
	
	@Test
	public void testSubtractNegativeGreaterPositive() //when positive number is greater than negative
	{
	  Maths math = new Maths();
	  int ans = math.subtract(8,-3);
	  Assert.assertEquals(11, ans);
	}
	
	@Test
	public void testSubtractPositiveGreaterNegative() //when negative number is greater than positive
	{
	  Maths math = new Maths();
	  int ans = math.subtract(-12,3);
	  Assert.assertEquals(-15, ans);
	}
	
	@Test
	public void testSubtractBothZeros() //when both are zeros
	{
	  Maths math = new Maths();
	  int ans = math.subtract(0,0);
	  Assert.assertEquals(0, ans);
	}

}

