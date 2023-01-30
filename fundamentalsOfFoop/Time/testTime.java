public class TestTime {
    
    public static void main(String args[]){

        Timee firstClock = new Timee();
        System.out.println(firstClock);

        for(int i = 0; i < 8000; i++) {
			firstClock.tick();
			System.out.println(firstClock);
		}
    } // end of mian
    
} // end of class 
