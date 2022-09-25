package com.bridgelabz;

public class CabInvoiceGenerator {

	public static double calculateFare(double distance, double time) {
		double totalFare = distance*Ride.Category.NORMAL_RIDE.costPerKm + time *Ride.Category.NORMAL_RIDE.costPerMinute;
		return totalFare<Ride.Category.NORMAL_RIDE.minimumFarePerRide?Ride.Category.NORMAL_RIDE.minimumFarePerRide:totalFare;
	}

	public static double calculateFare(Ride[] totalRide) {
		double totalFare = 0;
		for (Ride ride:totalRide) {
			totalFare += calculateFare(ride.distance,ride.time);
		}
		return totalFare;
	}
}
