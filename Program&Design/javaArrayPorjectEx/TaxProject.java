import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class TaxProject{

    public static void main(String[] args){
   
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

      
        final JPanel panel = new JPanel();
    
        JOptionPane.showMessageDialog(panel, "Please pay your taxes before January 31st !!", "Warning , Tax Deadline! ",
            JOptionPane.WARNING_MESSAGE);
        
    } 

   

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
        
        } 

        
    JOptionPane.showMessageDialog(null, "Total Tax :" + TotalTaxRevenue);
    return totalForMonth;  

    } 
   
    public static double findHighestTax(double[] totalForMonth) {

        Arrays.sort(totalForMonth);
        
        return totalForMonth[totalForMonth.length -1];


    } 


    public static double findLowestTax(double[] totalForMonth){

        Arrays.sort(totalForMonth);

        return totalForMonth[0];

    }

   
    public static double findAverageTax(double[] totalForMonth, double arraySize) {

        double sum = 0;
        for(int i = 0; i < totalForMonth.length; i++) {
            sum = sum + totalForMonth[i];
        }
        double averageTax = sum /12;
        
        return averageTax;

    } 
   
        public static String createUserMessage(double[] totalForMonth , double highestTax , double lowestTax, double averageTax ) {

            String userMessage = "" ; 
            String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

            userMessage = userMessage.concat("Revenue details : \n");
            for(int i = 0; i< totalForMonth.length; i++) {
                userMessage = userMessage.concat("Revenue of "+ months[i]+" is " +totalForMonth[i]+ "\n");
            } 

            userMessage = userMessage.concat("Highest Revenue is: " +highestTax + "\n");
            userMessage = userMessage.concat("Lowest Revenue is: " +lowestTax + "\n");
            userMessage = userMessage.concat("Average Tax is: " + averageTax + "\n");

            return userMessage;

        } 

    } 

// Amy o leary. (all code)
