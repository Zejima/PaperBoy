
public class BadBoy extends DeliveryBoy {
	private final double REDUCTION_RATE = 1.25;

	BadBoy(String name, double payPerDelivery) {
		super(name, payPerDelivery); 
	}
	
	@Override
	protected void makeDelivery(Place place) {
		System.out.println("Delivering to " + place);
		int r = (int) Math.floor(Math.random() * 2);
		if(r == 0) {
			System.out.println("*Grumble Grumble* *Places*");
		} else {
			System.out.println("I hate this job *toss*");
			pay -= REDUCTION_RATE;
		}
		deliveries++;
	}
}
