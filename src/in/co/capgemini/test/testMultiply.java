//to perform multiplication function of the calculator

package in.co.capgemini.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class testMultiply {

	@Test
	public void testMultiplyTwoPositive() //when both numbers are positive
	{
	  Maths math = new Maths();
	  int ans = math.multiply(9,2);
	  Assert.assertEquals(18, ans);
	}
	
	@Test
	public void testMultiplyTwoNegative() //when both numbers are negative
	{
	  Maths math = new Maths();
	  int ans = math.multiply(-3,-5);
	  Assert.assertEquals(15, ans);
	}
	
	@Test
	public void testMultiplyNegativePositive() //when positive number is greater than negative
	{
	  Maths math = new Maths();
	  int ans = math.multiply(8,-3);
	  Assert.assertEquals(-24, ans);
	}
	
	@Test
	public void testMultiplyBothZeros() //when both are zeros
	{
	  Maths math = new Maths();
	  int ans = math.multiply(0,0);
	  Assert.assertEquals(0, ans);
	}

}