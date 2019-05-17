import java.util.ArrayList;

public class DeliveryBoy {
	private String name;
	private double payPerDelivery;
	protected double pay; 
	protected int deliveries;
	
	DeliveryBoy (String name, double payPerDelivery){
		this.name = name; 
		this.payPerDelivery = payPerDelivery;
		this.pay = 0;
		deliveries = 0;
	}

	public double getPay() {
		return pay;
	}

	public double getDeliveries() {
		return deliveries;
	}
	
	public void doRoute(ArrayList<Place> route) {
		deliveries = 0;
		for(Place place : route) {
			if(place.canDeliver()) {
				pay += payPerDelivery;
				makeDelivery(place);
			}
		}
		System.out.println("Paid " + name + " $" + pay + " for their route");
	}
	
	protected void makeDelivery(Place place) {
		System.out.println("Delivering to " + place);
		System.out.println("K *places*");
		deliveries++;
	}
}


