
public class TestDate {

	public static void main(String[] args) {
		
		Date myDate = new Date();
		myDate.setDay(17);
		myDate.setMonth(1);
		myDate.setYear(2023);
		
		System.out.println(myDate);

		System.out.println(myDate.isLeapYear());
	
		
		
	}
}