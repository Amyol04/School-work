

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
	private int seconds;
	
	public Timee() {	
		setHours(12);
		setMinutes(0);
		setseconds(0);
	} // end of public 

	/**
	 * @param hours - 00 to 23
	 * @param minutes - 00 to 59
	 * @param seconds - 00 to 59
	 */

	public Timee(int hours, int minutes, int seconds) {
		setHours(hours);
		setMinutes(minutes);
		setseconds(seconds);
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

	// Getters and Setters // seconds
	public int getseconds() {
		return seconds;
	}
	
	public void setseconds(int newSeconds) {
		if(newSeconds >= 0 && newSeconds <= 59)
			seconds = newSeconds;
		
		else
			System.err.println("Invalid seconds");
	}


	// to String method
	public String toString() {
		return String.format("%02d/%02d/%02d", hours, minutes, seconds);
	}

	public void inc() {

		minutes++;



	}

} // end of class x 
