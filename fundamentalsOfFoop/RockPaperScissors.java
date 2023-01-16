import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		char userChoice;
		int compChoice;
		
		Scanner in = new Scanner(System.in);
				
		System.out.println("Rock Paper Scissors");
		System.out.println("R for Rock, P for Paper, S for Scissors");
		userChoice = in.nextLine().toUpperCase().charAt(0);
		
		if(userChoice != 'R' && userChoice != 'P' && userChoice != 'S') {
			System.out.println("ERROR - invalid choice");
			System.exit(0);
		}		
		
		// 0 = Rock, 1 = Paper, 2 = Scissors
		compChoice = (int)(Math.random() * 3);
		
		switch(compChoice) {
		case 0:
			System.out.println("Computer picked Rock");
			break;
		case 1:
			System.out.println("Computer picked Paper");
			break;
		case 2:
			System.out.println("Computer picked Scissors");
			break;
		}
		
		if(userChoice == 'R' && compChoice == 2 || 
				userChoice == 'P' && compChoice == 0 || 
				userChoice == 'S' && compChoice == 1) {
			System.out.println("You won");
		}else if(userChoice == 'R' && compChoice == 1 ||
				userChoice == 'P' && compChoice == 2 ||
				userChoice == 'S' && compChoice == 0) {
			System.out.println("You lost");
		}else {
			System.out.println("Draw");
		}
	}
}