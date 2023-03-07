package carGarage;
/*
 * @author 23.amyoleary
 *
 */
public class Truck extends Vehicle {
	
	private int weightLimit;

	public Truck(String module, String regNum, double speed, double fullCompasity, double fuleCompsution) {
		super(module, regNum, speed, fullCompasity, fuleCompsution);
		// TODO Auto-generated constructor stub
	}

	public int getWeightLimit() {
		return weightLimit;
	}

	public void setWeightLimit(int weightLimit) {
		this.weightLimit = weightLimit;
	}
	
}
