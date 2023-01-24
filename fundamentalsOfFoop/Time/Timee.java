/**
 * 
 * @author Amy o leary											
 * 
 * A class to represent a time
 *
 */
public class Timee {
	private int hours;
	private int minutes;
	private int secconds;
	
	public Timee() {	
		setHours(12);
		setMinutes(0);
		setSecconds(0);
	} // end of public 

	/**
	 * @param hours - 00 to 23
	 * @param minutes - 00 to 59
	 * @param secconds - 00 to 59
	 */

	public Timee(int hours, int minutes, int secconds) {
		setHours(hours);
		setMinutes(minutes);
		setSecconds(secconds);
	} // end public time 

		// Getters and Setters // Hours
	public int getHours() {
		return hours;
	}
		
	public void setHours(int newHours) {
		if(newHours >= 0 && newHours <= 23)
			hours = newHours;
		else
			System.err.println("Invalid hours");
	}

		// Getters and Setters // Minutes
	public int getMinutes() {
		return minutes;
	}
		
	public void setMinutes(int newMinutes) {
		if(newMinutes >= 0 && newMinutes <= 59)
			minutes = newMinutes;
		else
			System.err.println("Invalid minutes");
	}

	// Getters and Setters // Secconds
	public int getSecconds() {
		return secconds;
	}
	
	public void setSecconds(int newSecconds) {
		if(newSecconds >= 0 && newSecconds <= 59)
			secconds = newSecconds;
		
		else
			System.err.println("Invalid secconds");
	}


	// to String method
	public String toString() {
		return String.format("%02d/%02d/%02d", hours, minutes, secconds);
	}

	


} // end of class x 
