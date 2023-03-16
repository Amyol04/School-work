package carGarage;
/**
 * 
 * @author 23.amyoleary  Date 15/03/2023
 * 
 * 
 *  This is code that creates the string for the RegNumber, speed, fuelCompasity, fuelconsumption.
 * It will compute the amount of fuel required for the specified distance and return that result
 * after initialising all data members with the specified value.It provides all the necessary information
 * about the vehicles, calculates the distance at the specified time and speed, and then returns the distance result.
 *
 * */


public class Vehicle {
  private String Module;
  private String regNum;
  private double speed;       // km/hour
  private double fuelCompasity;  // liters 
  private double fuelconsumption;  // km / liter
  
  
	public Vehicle(String module, String regNum, double speed, double fuelCompasity, double FuelConsumption) {
	super();
	Module = module;
	this.regNum = regNum;
	this.speed = speed;
	this.fuelCompasity = fuelCompasity;
	this.fuelconsumption = FuelConsumption;
}
	public String getModule() {
		return Module;
	}
	public void setModule(String module) {
		Module = module;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getfuelCompasity() {
		return fuelCompasity;
	}
	public void setfuelCompasity(double fuelCompasity) {
		this.fuelCompasity = fuelCompasity;
	}
	public double getFuelConsumption() {
		return fuelconsumption;
	}
	public void setFuelConsumption(double FuelConsumption) {
		this.fuelconsumption = FuelConsumption;
	}
	  public double fuelNeeded(double distance) {
		 double fuelNeeded = distance * fuelconsumption;
		 return fuelNeeded;
	  } // calculates the fuel needed 
	  
	  public void display() {
		System.out.println(Module);
		System.out.println(regNum);
		System.out.println(speed);
		System.out.println(fuelCompasity);
		System.out.println(fuelconsumption);
	  } // prints out module , regNumber, speed , fuelCompasity and fuel compsuntion
	  
	  public double distanceCoveredKM(double time) {
		  double distance = speed * time;
		  return distance;
	  } // calculates distance. 
}