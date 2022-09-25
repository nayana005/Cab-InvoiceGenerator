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
	 public void givenDistanceAndTimeShouldReturnMinimumFare(){
	        double totalFare = CabInvoiceGenerator.calculateFare(0.3,1);
	        Assert.assertEquals(5, totalFare);
	    }
	 
	  @Test
	  public void givenMultiRidesShouldReturnTotalFare(){
	        Ride ride1 = new Ride(4,10);
	        Ride ride2 = new Ride(5,10);
	        Ride ride3 = new Ride(3,10);
	        Ride[] rides = new Ride[]{ride1,ride2,ride3};
	        double totalFare = CabInvoiceGenerator.calculateFare(rides);
	        Assert.assertEquals(150.0, totalFare);
	    }
	  
	  @Test
	  public void givenMultipleRidesShouldReturnInvoice(){
	        Ride ride1 = new Ride(4,10);
	        Ride ride2 = new Ride(5,10);
	        Ride ride3 = new Ride(3,10);
	        Ride[] rides = new Ride[]{ride1,ride2,ride3};
	       Invoice actualInvoice = CabInvoiceGenerator.generateInvoice(rides);
	       Invoice expectedInvoice = new Invoice(3,150.0,50.0);
	       Assert.assertEquals(expectedInvoice,actualInvoice);
	    }



}
