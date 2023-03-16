package carGarage;
/**
 * 
 * @author 23.amyoleary  Date 15/03/2023
 * 
 * This is a subclass that gives us the full detail for the truck including the RegNumber, speed, fullCompasity, fuelCompsution.
 *
 * */

 public class Truck extends Vehicle {
	
	private int cargoWeight;

	public Truck(String module, String regNum, double speed, double fullCompasity, double fuleCompsution, int cargoWeight) {
		super(module, regNum, speed, fullCompasity, fuleCompsution);
		this.cargoWeight = cargoWeight;
		
	}

	public int getcargoWeight() {
		return cargoWeight;
	}

	public void setcargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}
	
}
