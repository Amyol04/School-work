package Demos;

import javax.swing.*;

public class temp {
	public static void main(String[] args){
		
		 double cel, fah;
	        String input, output;
	        
	        //Get the temp in  
	        input = JOptionPane.showInputDialog("Enter a temp in \u00b0c");
	        cel = Double.parseDouble(input);
	        
	        //Convert from C to F
	        fah = cel * 9/5 + 32;
	        
	        //Output the Temp in F
	        output = String.format("%3f\u00b0c is  %3f\u00b0F", cel, fah);
	        JOptionPane.showMessageDialog(null, output);
			
		
	}
}
