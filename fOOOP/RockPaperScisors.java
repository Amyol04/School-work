package idk;

import java.util.Scanner;

public class RockPaperScisors {
	
	public static void main(String[] args) {
		char userChoice;
		int compChoice;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("rock Paper Scisors");
		System.out.println("r for Rock, P for Paper, S for Scisors");
		userChoice = in.nextLine().toUpperCase().charAt(0);
		
	
		
		compChoice = (int)(Math.random() * 3);
		
		switch(compChoice) {
		case 0:
			System.out.println("computer choose Rock");
			break;
		case 1:
			System.out.println("computer choose Paper");
			break;
		case 2:
			System.out.println("computer choose Scisors");
			break;
		}
		
		if(userChoice == 'R' && compChoice == 2 || 
				userChoice == 'P' && compChoice == 0 ||
				userChoice == 'S' && compChoice == 1) {
			System.out.println("You Win");
		}else if (userChoice == 'R' && compChoice == 1 ||
					userChoice == 'P' && compChoice == 2 ||
					userChoice == 'S' && compChoice == 0) {
			System.out.println("You lose");
		}else {
			System.out.println("draw");
		}
		
				
	}//end main

}//end of class
