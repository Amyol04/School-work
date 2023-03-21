package carGarage;

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
import javax.swing.JOptionPane;

public class Driver {
    public static void main(String[] args) {
        // create an instance of class Truck
        Truck myTruck = new Truck("Ford F-150", "ABC123", 120, 50, 10, 2000);
        // create an instance of class Bus
        Bus myBus = new Bus("Toyota Coaster", "XYZ456", 80, 80, 8,45);
        
        // call fuelNeeded() and display() methods using objects of these classes
        double fuelNeededForTruck = myTruck.fuelNeeded(100);
        double fuelNeededForBus = myBus.fuelNeeded(100);
        JOptionPane.showMessageDialog(null, "Fuel needed for Truck to travel 100 km: " + fuelNeededForTruck + " litres\n"
                                            + "Fuel needed for Bus to travel 100 km: " + fuelNeededForBus + " litres");
        myTruck.display();
        myBus.display();

		 
		System.out.println("The bus travels " + myBus.distanceCovered(1) + " in 1 hour");	 //distanceCoveredKM for Bus
		System.out.println("The truck travels " + myTruck.distanceCovered(1) + " in 1 hour");	 //distanceCoveredKM for Truck

        
        // use a method called efficiencyCalculator() to calculate which of 2 vehicle objects is the more efficient
        Vehicle moreEfficientVehicle = efficiencyCalculator(myTruck, myBus);
        JOptionPane.showMessageDialog(null, "The " + moreEfficientVehicle.getModel() + " is the more efficient vehicle.");
    }
    
    public static Vehicle efficiencyCalculator(Vehicle v1, Vehicle v2) {
        double fuelPerKm1 = 1 / v1.getFuelConsumption();
        double fuelPerKm2 = 1 / v2.getFuelConsumption();
        double distance1 = v1.distanceCovered(1);
        double distance2 = v2.distanceCovered(1);
        double efficiency1 = distance1 / fuelPerKm1;
        double efficiency2 = distance2 / fuelPerKm2;
        
        if (efficiency1 > efficiency2) {
            return v1;
        } else {
            return v2;
        }
    }
}

