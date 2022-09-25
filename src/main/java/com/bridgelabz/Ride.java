package com.bridgelabz;

public class Ride {

	public double time;
	public double distance;

	public Ride(double distance, double time) {
		this.distance = distance;
		this.time = time;
	}

	public enum Category {
		NORMAL_RIDE(10, 1, 5);

		public  final double costPerKm;
		public final int costPerMinute;
		public final double minimumFarePerRide;

		Category(double costPerKm, int costPerMinute, double minimumFarePerRide) {
			this.costPerKm = costPerKm;
			this.costPerMinute = costPerMinute;
			this.minimumFarePerRide = minimumFarePerRide;
		}
	}
}

