import java.util.Arrays;

import javax.swing.JOptionPane;

public class Assignment2 {

	public static void main(String[] args) {
		
		double[] taxFigure = null;
		String year = " ";
		String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		double[] salesFigure = null;
		int arraySize = 12;
		double averageRevenue = 0;
		
		taxFigure = fillArray(taxFigure, months);
		double lowestTax = getLowestTax (taxFigure);
		double highestTax = getHighestTax(taxFigure);
		averageRevenue = calculateAverageTax(taxFigure, averageRevenue);
		String userMessage = createUserMessage (taxFigure, lowestTax, highestTax, averageRevenue, highestTax, salesFigure, highestTax, highestTax, lowestTax, highestTax);
		JOptionPane.showMessageDialog(null, userMessage);

	}
	
	
	public static double [] fillArray(double[] taxFigure, String[] months) {
	
		double nextFigure;
		String nextFigureStr;
		int arraySize = 12;
		
		taxFigure = new double[arraySize];
		
		for(int i = 0; i < taxFigure.length; i++) {
			nextFigureStr = JOptionPane.showInputDialog(null, "Please enter your revenue for " + months[i] + " in EUR.");
			nextFigure = Double.parseDouble(nextFigureStr)* 0.125;
			taxFigure[i] = nextFigure;
		}
		
		
		
		return taxFigure;
	}
	

	
	public static double getLowestTax(double[] taxFigure) {
		
		Arrays.sort(taxFigure);
		double lowestTax = taxFigure[0];
		
		return lowestTax;
	}
	
	public static double getHighestTax(double[] taxFigure) {
		double highestTax = taxFigure[11];
		return highestTax;
	}
	
	public static double calculateAverageTax(double[] taxFigure, double arraySize) {
		double sum = 0;
		for(int i = 0; i < taxFigure.length; i++) {
			sum = sum + taxFigure[i];
		}
		double averageRevenue = sum/12;
		
		return averageRevenue;
	}
	
	public static String createUserMessage(double[] taxFigure, double getLowestTax, double getHighestTax, double calculateAverageHeight, double arraySize, double[] months, double average, double highestTax, double lowestTax, double averageRevenue) {
		String userMessage= " ";
		
		userMessage = userMessage.concat("Revenue details for the year are as follows: \n");
		
		double sumTax = 0;
		for(int i = 0; i < taxFigure.length; i++) {
			 sumTax = sumTax + taxFigure[i];
		}
		double sumRevenue = sumTax/0.125;
		
		userMessage = userMessage.concat("Total Revenue for the year is: " + sumRevenue+ "\n");
		userMessage = userMessage.concat("Total Tax for the year is: " + sumTax+ "\n");
		
		
		userMessage = userMessage.concat("Lowest monthly tax  is " + lowestTax +  " \n");
		userMessage = userMessage.concat("Highest monthly tax  is "+ highestTax +  " \n");
		userMessage = userMessage.concat("Average monthly tax  is "+ averageRevenue +  " \n");
		
		return userMessage;
	}
}
