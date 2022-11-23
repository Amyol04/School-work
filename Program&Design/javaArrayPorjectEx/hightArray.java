import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 * 
 * 
 * @author 23.amyoleary
 * 
 * 
 *
 */

public class hightArray {
	
	public static void main(String[] args) {
		
		double[] studentHeights = null;
		double smallestHeight = 0.0;
		String userMessage = "";
		
		studentHeights = fillArray(studentHeights);
		smallestHeight = findSmallestHeight(studentHeights);
		//largest height
		//average height
		userMessage = createUserMessage(studentHeights, smallestHeight);
		JOptionPane.showMessageDialog(null, userMessage);
		
	} // end of main
	
	public static double[] fillArray(double[] heightArray) {
		
		String arraySizeStr;
		double nextHeight;
		String nextHeightStr;
		arraySizeStr = JOptionPane.showInputDialog(null,"How"+ "many students will you be entering 
				hight measurements for?");
		
		int arraySize = Integer.parseInt(arraySizeStr);
		heightArray = new double[arraySize];
		
		
		for(int i = 0; i < arraySize; i++) {
            nextHeightStr = JOptionPane.showInputDialog(null, "please enter "
                    + "your next student height in meters?");
            nextHeight = Double.parseDouble(nextHeightStr);
            heightArray[i] = nextHeight;
			
		} // end for 
		
		return heightArray;
		
		
	} // end of method
	
	public static double findSmallestHeight(double[] heightArray) {
        
        Arrays.sort(heightArray);
        
        return heightArray[0];
        
    } // end of smallest 

	public static String createUserMessage(double[] heightArray, double smallestHeight) {
		
		String userMessage ="";
		
		userMessage = userMessage.concat("height details for your class are as follow: \n");
		for(int i = 0; i < heightArray.length; i++) {
            userMessage = userMessage.concat("height "+i+"is: "+heightArray[i]+"\n");
        }
		
        userMessage = userMessage.concat("Smallest height is: " +smallestHeight + "\n");
       
    
        return userMessage;
	} // end of user message
	
} // end of class

