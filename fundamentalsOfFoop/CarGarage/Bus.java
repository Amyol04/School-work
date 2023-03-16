package carGarage;
/**
 * 
 * @author 23.amyoleary  Date 15/03/2023
 * 
 * This is a subclass that gives us the full detail for the Bus including the RegNumber, speed, fullCompasity, fuelCompsution.
 *
 * */


public class{

	
} 


public class Bus extends Vehicle {
        private int numPassengers;

		public Bus(String module, String regNum, double speed, double fullCompasity, double fuelCompsution) {
			super(module, regNum, speed, fullCompasity, fuelCompsution);
			this.numPassengers = numPassengers;
		}

		public int getNumPassengers() {
			return numPassengers;
		}

		public void setNumPassengers(int numPassengers) {
			this.numPassengers = numPassengers;
		}
        
		
}
