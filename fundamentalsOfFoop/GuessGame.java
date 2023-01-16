import java.util.Scanner;
public class GuessGame {
	public static void main(String[] args) {
		int randomNumber = (int)(Math.random() * 100) + 1;
		int guess;
		Scanner in = new Scanner(System.in);
		
		System.out.println("----==== Guess the number ====----");
		do {
			System.out.print("Enter a number: ");
		
			guess = in.nextInt();
		
			if (guess == randomNumber) {
				System.out.println("Well done");
			}else if (guess > randomNumber){
				System.out.println("Lower");
			}else{
				System.out.println("Higher");
			}
		}while(guess != randomNumber);
		in.close();
	}
}