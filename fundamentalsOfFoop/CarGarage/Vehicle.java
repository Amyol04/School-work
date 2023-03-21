package carGarage;
/**
 * 
 * @author 23.amyoleary  Date 15/03/2023
 * 
 * 
 *  This is code that creates the string for the RegNumber, speed, fuelCompasity, fuelCompsution.
 * It will compute the amount of fuel required for the specified distance and return that result
 * after initialising all data members with the specified value.It provides all the necessary information
 * about the vehicles, calculates the distance at the specified time and speed, and then returns the distance result.
 *
 * */

 public class Vehicle {
    private String model;
    private String registrationNumber;
    private double speed; // km/hour
    private double fuelCapacity; // litres
    private double fuelConsumption; // km/litre
    
    public Vehicle(String model, String registrationNumber, double speed, double fuelCapacity, double fuelConsumption) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public double getFuelCapacity() {
        return fuelCapacity;
    }
    
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    
    public double fuelNeeded(double distance) {
        return distance / fuelConsumption;
    }
    
    public double distanceCovered(double time) {
        return speed * time;
    }
    
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Speed: " + speed + " km/hour");
        System.out.println("Fuel capacity: " + fuelCapacity + " litres");
        System.out.println("Fuel consumption: " + fuelConsumption + " km/litre");
    }
}
