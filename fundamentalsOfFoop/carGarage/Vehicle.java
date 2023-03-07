package carGarage;
/**
 * 
 * @author 23.amyoleary
 *  a breif descition 
 **/


public class Vehicle {
  private String Module;
  private String regNum;
  private double speed;       // km/hour
  private double fullCompasity;  // liters 
  private double fuelCompsution;  // km / liter
  
  
	public Vehicle(String module, String regNum, double speed, double fullCompasity, double fuleCompsution) {
	super();
	Module = module;
	this.regNum = regNum;
	this.speed = speed;
	this.fullCompasity = fullCompasity;
	this.fuelCompsution = fuleCompsution;
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
	public double getFullCompasity() {
		return fullCompasity;
	}
	public void setFullCompasity(double fullCompasity) {
		this.fullCompasity = fullCompasity;
	}
	public double getFuleCompsution() {
		return fuelCompsution;
	}
	public void setFuleCompsution(double fuleCompsution) {
		this.fuelCompsution = fuleCompsution;
	}
	  public double fuelNeeded(double distance) {
		  return 0.0; // TODO code Method
	  }
	  
	  public void display() {
		//TODO code Method 
	  }
	  
	  public double distanceCoveredKM(double time) {
		  return 0.0;  //TODO code Method 
	  }
}
