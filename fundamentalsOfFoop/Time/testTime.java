/**
 * 
 * @author Amy o leary											
 * Softwear Development. Kerry College. 31/1/2023
 * A class to represent a time.
 *
 */

public class TestTime {
    
    public static void main(String args[]){

        Timee firstClock = new Timee();
        System.out.println(firstClock);

        for(int i = 0; i < 8000; i++) {
			firstClock.tick();
			System.out.println(firstClock);
		} // loop sytem to add to secconds / mins / hours. 

    } // end of mian
    
} // end of class 
