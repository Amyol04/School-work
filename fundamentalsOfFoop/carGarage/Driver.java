package carGarage;
/*
 * @author 23.amyoleary
 * 
 */
public class Driver {
	
	public static void main(String[] args) {
		
		Bus myBus = new Bus("Bus100", "132 D 24", 0, 400, 2.5);
		Truck myTruck = new Truck("Bus100", "132 D 24", 0, 400, 2.5);
		
		System.out.println("Fule needed to drive the bus 150km" +myBus.fuelNeeded(100)); 
		myBus.display();
		System.out.println("Fule needed to drive the truck 150km" +myTruck.fuelNeeded(100));
		myTruck.display();
		
		System.out.println("The bus travels " +myBus.distanceCoveredKM(1)+ " in one hour");
		System.out.println("The truck travels " +myTruck.distanceCoveredKM(1)+ " in one hour");
		
		efficiencyCalculator(myBus, myTruck);
		
	}
	private static void efficiencyCalculator(Vehicle v1, Vehicle v2) {
		
	}
}
