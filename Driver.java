import java.util.ArrayList;

public class Driver {
	  public static void main(String[] args) {
		ArrayList<Place> route = new ArrayList<Place>();
		route.add(new School("Central Highschool"));
		route.add(new House("123 Road Lane"));
		route.add(new House("124 Road Lane"));
		route.add(new House("125 Road Lane"));
		route.add(new House("126 Road Lane"));
		route.add(new House("127 Road Lane"));
		route.add(new House("128 Road Lane"));
		route.add(new House("129 Road Lane"));
		route.add(new House("130 Road Lane"));
		
		DeliveryBoy boy1 = new DeliveryBoy("Bobby",2.00);
		DeliveryBoy boy2 = new BadBoy("Bobby",2.00);
		DeliveryBoy boy3 = new GoodBoy("Bobby",2.00);
		System.out.print("Normal Delivery Boy doing route");
		boy1.doRoute(route);
		System.out.println("\nBad Boy doing route");
		boy2.doRoute(route);
		System.out.println("\nGood Boy doing route");
		boy3.doRoute(route);
	}
}
