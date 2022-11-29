import java.util.Arrays;

import javax.swing.JOptionPane;

public class Assignment2{

public static void main(String[] args){
 // variables 
    double[] totalForMonth = null;
    double getHighestTax = 0.00;
    double getLowestTax = 0.00;
    String userMessage = "";
    //double [] TotalTaxRevenue = fillArray(totalForMonth);
    totalForMonth = fillArray(totalForMonth);
    getHighestTax = findHighestTax(totalForMonth);
    getLowestTax = findLowestTax(totalForMonth);

    userMessage = createUserMessage(totalForMonth, getHighestTax , getLowestTax);
    JOptionPane.showMessageDialog(null, userMessage);

    // remind user to pay tax !! 
    JOptionPane.showMessageDialog(null, " Please pay before January 31st !! ");
    
} // end of main

public static double[] fillArray(double[] totalForMonth) {

    String[] months = {"Jan" , "Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    String arraySizeStr;
    double nextTax;
    String nextTaxStr = "";
    double TotalTaxRevenue = 0.0;
    
    arraySizeStr = JOptionPane.showInputDialog(null, "How many months will you be entering revenue for??");
    int arraySize = Integer.parseInt(arraySizeStr);
    totalForMonth = new double[arraySize];

    for( int i = 0; i < arraySize; i++){
        nextTaxStr = JOptionPane.showInputDialog(null, "Please enter your revenue for " +months[i] + ":)");
        nextTax = Double.parseDouble(nextTaxStr);
        totalForMonth[i] = nextTax;

        TotalTaxRevenue = TotalTaxRevenue + nextTax / 12.5;
      
    } // end for

JOptionPane.showMessageDialog(null, "Total Tax :" + TotalTaxRevenue);
return totalForMonth;

} // end of fill array Method 

public static double findHighestTax(double[] heightArray) {

    Arrays.sort(heightArray);
    
    return heightArray[heightArray.length -1];


} // end highest tax

public static double findLowestTax(double[] heightArray){

    Arrays.sort(heightArray);

    return heightArray[0];

} // end of Lowest tax

    public static String createUserMessage(double[] heightArray , double highestTax , double lowestTax) {

        String userMessage = "" ; 

        userMessage = userMessage.concat("Revenue details : \n");
        for(int i = 0; i< heightArray.length; i++) {
            userMessage = userMessage.concat("revenue of "+i+"is;" +heightArray[i]+ "\n");
        } // end of for 

        userMessage = userMessage.concat("Highest Revenue is:" +highestTax + "\n");
        userMessage = userMessage.concat("Lowest Revenue is:" +lowestTax + "\n");

        return userMessage;

    } // end of createUserMessage
} // end of class
