package carGarage;
/**
 * 
 * @author 23.amyoleary  Date 15/03/2023
 * 
 * This is a subclass that gives us the full detail for the Bus including the RegNumber, speed, fullCompasity, fuelCompsution.
 *
 * */



 public class Bus extends Vehicle {
    private int numOfPassengers;
    
    public Bus(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption, int numOfPassengers) {
        super(model, registrationNumber, speed, fuelCapacity, fuelConsumption);
        this.numOfPassengers = numOfPassengers;
    }
    
    public int getNumOfPassengers() {
        return numOfPassengers;
    }
    
    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
}
