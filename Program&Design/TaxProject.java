package MainProject;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 * 
 * Author @Amy O Leary, Software development. 20/11/2022
 * 
 * This program promts a user for their revenue for the months of the year 
 * it calculates the tax for these months, it does this by dividing the inputed revenue by 12.5%
 * this program calculates the average. 
 * it then displays the Lowest tax , highest tax and the average to the users.
 * This program warns the user to pay their taxes by the 31st of Janurary. 
 * 
 */

public class TaxProject{

public static void main(String[] args){
 // variables created. 
    double[] totalForMonth = new double[12];
    double getHighestTax = 0.00;
    double getLowestTax = 0.00;
    String userMessage = "";
    double averageTax = 0.0;

 
    totalForMonth = fillArray(totalForMonth);
    getHighestTax = findHighestTax(totalForMonth);
    getLowestTax = findLowestTax(totalForMonth);
    averageTax = findAverageTax(totalForMonth,12 );

    userMessage = createUserMessage(totalForMonth, getHighestTax , getLowestTax, averageTax);
    JOptionPane.showMessageDialog(null, userMessage);

    // remind user to pay tax !! 
    final JPanel panel = new JPanel();
 
    // a warning message asking the user to pay their Taxes before Januaray 32st 
    JOptionPane.showMessageDialog(panel, "Please pay your taxes before January 31st !!", "Warning , Tax Deadline! ",
        JOptionPane.WARNING_MESSAGE);
    
} // end of main

/**
 * 
 * this method promts user to fill in their revenue for each month. It then calculates the tax using ln 64.
 * "TotalTaxRevenue = TotalTaxRevenue + nextTax / 12.5;"
 */

public static double[] fillArray(double[] totalForMonth) {

    double nextTax;
    String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String nextTaxStr = "";
    double TotalTaxRevenue = 0.0;
   


    for(int i = 0; i < totalForMonth.length; i++) {
        nextTaxStr = JOptionPane.showInputDialog(null, "Please enter your revenue for " + months[i] + " in EUR.");
        nextTax = Double.parseDouble(nextTaxStr)* 0.125;
        totalForMonth[i] = nextTax;

        TotalTaxRevenue = TotalTaxRevenue + nextTax / 12.5;
      
    } // end for

    
JOptionPane.showMessageDialog(null, "Total Tax :" + TotalTaxRevenue);
return totalForMonth;  // returns total tax 

} // end of fill array Method 

// sorts the Highest tax using arrays. sort !! 
public static double findHighestTax(double[] totalForMonth) {

    Arrays.sort(totalForMonth);
    
    return totalForMonth[totalForMonth.length -1];


} // end highest tax

// sorts Lowest tax using arrays. sort !! 
public static double findLowestTax(double[] totalForMonth){

    Arrays.sort(totalForMonth);

    return totalForMonth[0];

} // end of Lowest tax

/**
 * 
 * this method finds the average tax by grabbing the total for the month
 * and the array size (12) and dividing the user input by 12 ! 
 *
 */
public static double findAverageTax(double[] totalForMonth, double arraySize) {

    double sum = 0;
    for(int i = 0; i < totalForMonth.length; i++) {
        sum = sum + totalForMonth[i];
    }
    double averageTax = sum /12;
    
    return averageTax;

} // end of average.
 
/**
 *  this is the last method used in this code, this method displays the user message. 
 * The method dispays the totalForMonth, highestTax , LowestTax and Average. 
 * 
 */
    public static String createUserMessage(double[] totalForMonth , double highestTax , double lowestTax, double averageTax ) {

        String userMessage = "" ; 
        String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        userMessage = userMessage.concat("Revenue details : \n");
        for(int i = 0; i< totalForMonth.length; i++) {
            userMessage = userMessage.concat("Revenue of "+ months[i]+" is " +totalForMonth[i]+ "\n");
        } // end of for 

        userMessage = userMessage.concat("Highest Revenue is: " +highestTax + "\n");
        userMessage = userMessage.concat("Lowest Revenue is: " +lowestTax + "\n");
        userMessage = userMessage.concat("Average Tax is: " + averageTax + "\n");

        return userMessage;

    } // end of createUserMessage

} // end of class

// Amy o leary. (all code)
