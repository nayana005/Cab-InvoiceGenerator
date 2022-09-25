package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

	CabInvoiceGenerator generator;

	@Before
	public void initilize(){
		generator = new CabInvoiceGenerator();
	}

	@Test
	public void givenDistanceAndTimeShouldReturnTotalFare(){
		double totalFare = CabInvoiceGenerator.calculateFare(4.4,4);
		Assert.assertEquals(48, totalFare);
	}

	 @Test
	    void givenDistanceAndTimeShouldReturnMinimumFare(){
	        double totalFare = CabInvoiceGenerator.calculateFare(0.3,1);
	        Assert.assertEquals(5, totalFare);
	    }

}
