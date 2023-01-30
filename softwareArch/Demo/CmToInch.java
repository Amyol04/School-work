package Demos;
import javax.swing.JOptionPane;

public class CmToInch {

public static void main(String[] args) {
		
		double cm, inch;
		String input, output;
		
		//Get the temp in  
		input = JOptionPane.showInputDialog("Enter a temp in \u00b0Cm");
		cm = Double.parseDouble(input);
		
		//Convert from C to F
		inch = cm/ 2.54;
		
		//Output the Temp in F
		output = String.format("%3f\u00b0Cm is  %3f\u00b0Inch", cm, inch);
		JOptionPane.showMessageDialog(null, output);
	
}


}