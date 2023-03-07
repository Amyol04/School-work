package carGarage;



public class Bus extends Vehicle {
        private int numPassengers;

		public Bus(String module, String regNum, double speed, double fullCompasity, double fuelCompsution) {
			super(module, regNum, speed, fullCompasity, fuelCompsution);
			// TODO Auto-generated constructor stub
		}

		public int getNumPassengers() {
			return numPassengers;
		}

		public void setNumPassengers(int numPassengers) {
			this.numPassengers = numPassengers;
		}
        
		
}
