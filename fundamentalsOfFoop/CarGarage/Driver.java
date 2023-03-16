public package carGarage;

/**
 * 
 * @author 23.amyoleary  Date 15/03/2023
 * 
 *  It has an instance of class Truck that initializes all the data members with proper values. 
 *  and an instance of class Bus and initialize all the data members with proper values. 
 *  uses distanceCoveredKM() and method to evaluate distance covered.  
 *	it uses a method called efficiencyCalculator() to calculate which of 2 vehicle objects is the more efficient.
 *  The efficiency method takes in 2 vehicle objects as a parameter and print which is most efficient to screen using a dialog box.
 *
 * */

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
	private static void efficiencyCalculator(Vehicle v1, Vehicle v2){
   }
} 

