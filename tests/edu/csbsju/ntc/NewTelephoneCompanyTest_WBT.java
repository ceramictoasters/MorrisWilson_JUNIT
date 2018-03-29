package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	  private NewTelephoneCompany ntc;

	
	 @Before
	 public void setUp() throws Exception {
		 ntc = new NewTelephoneCompany();
	  }
	 
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeNegative() {
		ntc.setStartTime(-5);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeNegative2() {
		ntc.setStartTime(-1);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeOutOfBounds() {
		ntc.setStartTime(2544);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeOutOfBounds2() {
		ntc.setStartTime(2400);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeOutOfBounds3() {
		ntc.setStartTime(2401);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeOutOfBounds4() {
		ntc.setStartTime(1578);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeOutOfBounds5() {
		ntc.setStartTime(1160);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeOutOfBounds6() {
		ntc.setStartTime(1161);
		ntc.setDuration(10);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidStartTimeOutOfBounds7() {
		ntc.setStartTime(799);
		ntc.setDuration(-5);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidDurationZero() {
		ntc.setStartTime(1800);
		ntc.setDuration(0);
		ntc.computeCharge();
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testInvalidDurationNegative() {
		ntc.setStartTime(1801);
		ntc.setDuration(-1);
		ntc.computeCharge();
	}
	
	@Test
	public void testDiscountedStartTimeAndDuration() {
		double expectedValue = 1768.0;
		ntc.setStartTime(500);
		ntc.setDuration(100);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	
	@Test
	public void testDiscountedStartTimeAndDuration2() {
		double expectedValue = 1078.48;
		ntc.setStartTime(759);
		ntc.setDuration(61);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	
	@Test
	public void testDiscountedStartTimeAndDuration3() {
		double expectedValue = 1078.48;
		ntc.setStartTime(1959);
		ntc.setDuration(61);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	
	@Test
	public void testDiscountedStartTimeAndDuration4() {
		double expectedValue = 1149.2;
		ntc.setStartTime(2359);
		ntc.setDuration(65);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	
	@Test
	public void testDiscountedStartTime() {
		double expectedValue = 1248.0;
		ntc.setStartTime(0);
		ntc.setDuration(60);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTime2() {
		double expectedValue = 1227.2;
		ntc.setStartTime(400);
		ntc.setDuration(59);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTime3() {
		double expectedValue = 20.8;
		ntc.setStartTime(759);
		ntc.setDuration(1);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTime4() {
		double expectedValue = 208.0;
		ntc.setStartTime(1800);
		ntc.setDuration(10);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTime5() {
		double expectedValue = 208.0;
		ntc.setStartTime(1801);
		ntc.setDuration(10);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedStartTime6() {
		double expectedValue = 208.0;
		ntc.setStartTime(2359);
		ntc.setDuration(10);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedDuration() {
		double expectedValue = 2298.4;
		ntc.setStartTime(800);
		ntc.setDuration(65);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testDiscountedDuration2() {
		double expectedValue = 2156.96;
		ntc.setStartTime(900);
		ntc.setDuration(61);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testNoDiscounts() {
		double expectedValue = 1664.0;
		ntc.setStartTime(1000);
		ntc.setDuration(40);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testNoDiscounts2() {
		double expectedValue = 41.6;
		ntc.setStartTime(800);
		ntc.setDuration(1);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testNoDiscounts3() {
		double expectedValue = 2454.4;
		ntc.setStartTime(801);
		ntc.setDuration(59);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	
	@Test
	public void testNoDiscounts4() {
		double expectedValue = 2496.0;
		ntc.setStartTime(1759);
		ntc.setDuration(60);
		assertTrue("result is: " + ntc.computeCharge(), expectedValue == ntc.computeCharge());
	}
	

}
