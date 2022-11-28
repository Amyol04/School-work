import java.util.Arrays;
import javax.swing.JOptionPane;
/*
 *
 *
 */
public class TaxProject {
    public static void main(String[] args) {
        String[] taxPerMonth = {"Jan" , "Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        double lowestTax = 0.0;
        String userMessage ="";

        taxPerMonth = fillArray(taxPerMonth);
        lowestTax = findlowestTax(taxPerMonth);

        //largest tax
        //avrage tax
        userMessage = createUserMessage(taxPerMonth,lowestTax); 
        JOptionPane.showMessageDialog(null, userMessage);

} // end main

public static double[] fillArray(String[] taxPerMonth) {

    double nextMonth;
    String nextMonthsStr;

    
    for(int i = 0; i < arraySize; i++) {
        nextMonthStr = JOptionPane.showInputDialog(null, "please enter "
                + "tax her month?");
        nextMonth = Double.parseDouble(nextMonthStr);
        taxPerMonth[i] = nextMonth;
        
    } // end for 

    return taxPerMonth;

    } // end of method

    public static double findlowestTax(double[] taxArray){

        Array.sort(taxArray);

        return taxArray[0];

    } // end of smallest

    
} // end of class
