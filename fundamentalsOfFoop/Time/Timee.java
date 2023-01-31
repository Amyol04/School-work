/**
 * 
 * @author Amy o leary											
*  Softwear Development. Kerry College. 31/1/2023
 * A class to represent a time.
 *
 */
public class Timee {
			private int hours;
			private int minutes;
			private int seconds;
			// ints for seconds, mins and hours. 
	
	
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
// sets hours. 

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
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}
 // for format. 
	public void inc() {

		minutes++;

	}

    public void tick() {
		seconds++;
		
			if(seconds > 59){
				minutes++;
				seconds = 0;
			}
 // if secconds go above 59. It adds to minuts.
// resets back go 0 when it goes avove. 
			if(minutes > 59){
				hours++;
				minutes = 0;
			}
// same as secconds but it adds time to minuts 

			if(hours > 23){
				hours = 0;

			}
// resets hours when it goes above 23. 

    }

} // end of class x 
