//to perform division function of the calculator

package in.co.capgemini.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.Test;



public class testDivision {

	@Test
	public void testDivideTwoPositive() //when both numbers are positive
	{
	  Maths math = new Maths();
	  float ans = math.divide(9,3);
	  Assert.assertEquals(3, ans,0);
	}
	
	@Test
	public void testDivideTwoNegative() //when both numbers are negative
	{
	  Maths math = new Maths();
	  float ans = math.divide(-15,-5);
	  Assert.assertEquals(3, ans,0);
	}
	
	@Test
	public void testDivideNegativePositive() //when positive number is divided by negative and vice versa
	{
	  Maths math = new Maths();
	  float ans = math.divide(8,-2);
	  Assert.assertEquals(-4, ans,0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideByZeros() //when divide by zeros
	{
	  Maths math = new Maths();
	  float ans = math.divide(3,0);
	  }

}