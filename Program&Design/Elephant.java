package MainProject;
import javax.swing.JOptionPane;

public class Elephant {
	
	public static void main(String[] args){
		
	
	int elephantsAnswer = 0;
	int elephantsrInQueue = 0;
	int spaceInMini = 0;
	int noOfElephents = 0;
	String userMessage = "";
	
	//while loop will keep asking questions as long as the user is answering yes
	while(elephantsrInQueue== 0 && spaceInMini == 0) {
		
		//Ask the user if they want to enter the car?
		elephantsAnswer = JOptionPane.showConfirmDialog(null,
				"Do you wanna enter the car?", "please confirm your answer", JOptionPane.YES_NO_CANCEL_OPTION);
		
		//when the user selects yes

		if(elephantsAnswer == 0) {
			noOfElephents++;
			userMessage = "there are now "+noOfElephents+ "elephants in the car";
		
		}
		//check if there are more cars in the queue?
		elephantsrInQueue = JOptionPane.showConfirmDialog(null,
				"are there more cars in the queue? ", "please confirm your answer", JOptionPane.YES_NO_CANCEL_OPTION);
		spaceInMini = JOptionPane.showConfirmDialog(null,
				"is there room in the car for more? ", "please confirm your answer", JOptionPane.YES_NO_CANCEL_OPTION);
		}//end while
		// once while loop is complete - update users on elephents in the mini
		userMessage = "There are now " +noOfElephents+" elephants in the mini ";
		JOptionPane.showMessageDialog(null, userMessage);


	}//end main


}//end class
