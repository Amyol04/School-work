
public class TestTime {
    
    public static void main(String args[]){

        int hours, minutes, seconds;
        Scanner keyboard = new Scanner(System.in);
        
        	
        Timee firstClock = new Timee();
        System.out.println(firstClock);

        for(int i = 0; i < 60; i++) {
			firstClock.tick();
			System.out.println(firstClock);
		}
    } // end of mian
    
} // end of class 
