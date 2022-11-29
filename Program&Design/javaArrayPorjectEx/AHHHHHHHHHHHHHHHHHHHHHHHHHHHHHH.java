import java.util.Arrays;

 

import javax.swing.JOptionPane;

 

public class sslay {

 

public static void main(String[] args) {

    double [] inputSalary = null;
    double lowestTax = 0.0;
    double highestTax = 0.0; 
    double averageTax = 0.0; 
    double tax = 12.5;

    String ownerMessage = "";
    String afterTax = "";

 

    inputSalary = fillArray(inputSalary);
    lowestTax = findLowestTax(inputSalary);
    highestTax = findHighestTax(inputSalary);
    averageTax = findAverageTax (inputSalary);
    ownerMessage =  createOwnerMessage( inputSalary, lowestTax, highestTax, averageTax);

    JOptionPane.showMessageDialog(null, ownerMessage);

   //end main


public static double[] fillArray (double[] salaryArray) {

 

     String salaryArrayStr = "";
     double nextIncome = 0 ;

    String nextIncomeStr = "";
    salaryArrayStr = JOptionPane.showInputDialog(null, "How many employee will you be entering salary for?");

    int arrayTax = Integer.parseInt(salaryArrayStr);

 

    salaryArray = new double [arrayTax];

 

    for ( int i =0; i< arrayTax; i++) {
        nextIncomeStr = JOptionPane.showInputDialog(null, "please enter your next employee salary");
        nextIncome = Double.parseDouble( nextIncomeStr);
    salaryArray [i] = nextIncome;

    double revTax = (nextIncome*12.5)/100;

    Object afterTax = String.format("%.2 is %.2" );

}//end for


return salaryArray;

} // end main

public static double  findLowestTax (double[]salaryArray) {

    Arrays.sort(salaryArray);
    return salaryArray[0];

}//end main

public static double findHighestTax (double[]salaryArray) {

    Arrays.sort(salaryArray);
    return salaryArray [1];

}// end main

 

 

public static double findAverageTax(double[]salaryArray){

 

                double averIncome = 0;
                double i = 0;

                for(double averIncome = 0; i < salaryArray.length; i++)

        return averIncome[];

}  

public static String createOwnerMessage( double[] salaryArray, double lowestTax, double highestTax, double averageTax) {
String OwnerMessage = "";

OwnerMessage = OwnerMessage.concat("Tax account for revenue for one year are as follow : \n");

for (int i = 1; i < salaryArray.length; i++) {

    OwnerMessage = OwnerMessage.concat("Employee "  +i+ " is : " + salaryArray[i]+"\n");
    OwnerMessage = OwnerMessage.concat("Highest Tax is : " + highestTax + "\n");
    OwnerMessage = OwnerMessage.concat("Lowest Tax is : " + lowestTax + "\n");
    OwnerMessage = OwnerMessage.concat("averageTax Tax is : " + averageTax + "\n");

}// end for 

    return OwnerMessage;

}

}//end main
