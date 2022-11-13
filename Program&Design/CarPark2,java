import javax.swing.JOptionPane;

public class Garage1 {

	public static void main(String[] args) {

		int carAnswer =0;
		int carInQueue =0;
		int spaceInGarage =0;
		int noOfCars =0;
		String userMessage ="";
		int garageLimit =10;
		String carLeft ="";

		//while loop is dependent on there being cars in the queue and space in the garage
		while(carInQueue == 0 && spaceInGarage == 0 && garageLimit == 10) {

		carAnswer = JOptionPane.showConfirmDialog(null, 
				"do you want to come into the garage", "please confirm your answer", JOptionPane.YES_NO_CANCEL_OPTION);
		//only increment no of cars in garage if next car wants to come in
		if(carAnswer == 0) {
			noOfCars++;
			userMessage = "there are now " +noOfCars+ " cars in the garage";
			JOptionPane.showConfirmDialog(null, userMessage); //update user to no of cars in garage

		}

		//prompts for cars in queue and space in garage
		carInQueue = JOptionPane.showConfirmDialog(null, 
				"are there cars in the queue?" ," please confirm your answer", JOptionPane.YES_NO_CANCEL_OPTION);

		spaceInGarage = JOptionPane.showConfirmDialog(null, 
				"is there space in the garage", "please confirm your answer", JOptionPane.YES_NO_CANCEL_OPTION);

		carAnswer = JOptionPane.showConfirmDialog(null, 
				"do you want to leave the garage", "please confirm your answer", JOptionPane.YES_NO_CANCEL_OPTION);
                if (carAnswer == JOptionPane.YES_OPTION) {
                    noOfCars--;}
		//only increment no of cars in garage if next car wants to come in

		}
		//once while loop is complete - update users on the cars in the garage
		userMessage = "There are now " +noOfCars+" cars in the garage ";
		JOptionPane.showMessageDialog(null, userMessage);
		
	}//end of class
}//end of main

