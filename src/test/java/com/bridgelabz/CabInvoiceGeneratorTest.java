
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
	  public void givenMultipleRidesShouldReturnTotalFare(){
	        Ride ride1 = new Ride(4,10);
	        Ride ride2 = new Ride(5,10);
	        Ride ride3 = new Ride(3,10);
	        Ride[] rides = new Ride[]{ride1,ride2,ride3};
	        double totalFare = CabInvoiceGenerator.calculateFare(rides);
	        Assert.assertEquals(150.0, totalFare);
	    }

	  @Test
	  public void givenUserIdReturnsInvoice(){
	        Ride ride1 = new Ride(4,10);
	        Ride ride2 = new Ride(5,10);
	        Ride ride3 = new Ride(3,10);
	        Ride[] rides = new Ride[]{ride1,ride2,ride3};
	        Customer customer = new Customer(1);
	        customer.rideList = rides;
//	        customer.rideList.add(ride1);
//	        customer.rideList.add(ride2);
//	        customer.rideList.add(ride3);
	        CabInvoiceGenerator.customerList.add(customer);
	        Ride ride4 = new Ride(3,15);
	        Ride[] rides1 = new Ride[]{ride4};
	        Customer customer2 = new Customer(2);
	        customer2.rideList = rides1;
//	        customer2.rideList.add(ride4);
	        CabInvoiceGenerator.customerList.add(customer2);
	       Invoice actualInvoice = CabInvoiceGenerator.generateInvoice(1);
	        Invoice expectedInvoice = new Invoice(3,150.0,50.0);
	        Assert.assertEquals(expectedInvoice,actualInvoice);
	    }


}
