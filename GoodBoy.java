
public class GoodBoy extends DeliveryBoy {
	private final double TIP = 1.00;

	GoodBoy(String name, double payPerDelivery) {
		super(name, payPerDelivery); 
	}

	@Override
	protected void makeDelivery(Place place) {
		System.out.println("Delivering to " + place);
		int r = (int) Math.floor(Math.random() * 2);
		if(r == 0) {
			System.out.println("*Whistles* *Places*");
		} else {
			System.out.println("Well hello there <sir/madam>! *hand delivers*");
			pay += TIP;
		}
		deliveries++;
	}
}
