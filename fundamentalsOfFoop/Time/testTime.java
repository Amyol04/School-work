public class TestTime {
    
    public static void main(String args[]){
        	
        Timee firstClock = new Timee();
        System.out.println(firstClock);

        for(int i = 0; i < 24; i++) {
			firstClock.inc();
			System.out.println(firstClock);
		}
    }
    
}
