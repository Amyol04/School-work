
public class Date {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}
	
	public void setDay(int newDay) {
		if(newDay >= 1 && newDay <= 31)
			day = newDay;
		else
			System.err.println("Invalid Day");
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12)
			this.month = month;
		else
			System.err.println("Invalid month");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year >= 0)
			this.year = year;
		else
			System.err.println("Invalid Year");
	}
	
	public String toString() {
		return String.format("%02d/%02d/%04d", day, month, year);
	}
	
	private boolean isLeapYear() {
		if(year % 4 == 0 && !(year % 100 == 0)) {
			return true;
		}else if(year % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 *  Increase the date by one day
	 */
	public void inc() {
		
	}
}