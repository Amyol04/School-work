package carGarage;
/**
 * 
 * @author 23.amyoleary  Date 15/03/2023
 * 
 * This is a subclass that gives us the full detail for the truck including the RegNumber, speed, fullCompasity, fuelCompsution.
 *
 * */

 public class Truck extends Vehicle {
    private double cargoWeightLimit; // kg
    
    public Truck(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption, double cargoWeightLimit) {
        super(model, registrationNumber, speed, fuelCapacity, fuelConsumption);
        this.cargoWeightLimit = cargoWeightLimit;
    }
    
    public double getCargoWeightLimit() {
        return cargoWeightLimit;
    }
    
    public void setCargoWeightLimit(double cargoWeightLimit) {
        this.cargoWeightLimit = cargoWeightLimit;
    }
}
