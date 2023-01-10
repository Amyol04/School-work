package fOOOP;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
		
            int randomNumber = (int)(Math.random() * 5) + 1;
            int guess;
            Scanner in = new Scanner(System.in);
            
            System.out.println("----====Guess The Number====----");
            do {
            System.out.println("Enter the number");
            
            guess = in.nextInt();
            
            if (guess == randomNumber) {
                System.out.println("Well Done");

                
            }else if (guess > randomNumber){
                System.out.println("Lower pls x");

            }else if (guess < randomNumber){
                System.out.println("Higher pls x");
            }else {
                System.out.println("Incorecct");
            }	
        }while(guess != randomNumber);
        in.close();
    }
}
 
