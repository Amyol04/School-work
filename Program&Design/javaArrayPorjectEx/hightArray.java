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
		studentHeights = fillArray(studentHeights);
	} // end of main
	
	public static double[] fillArray(double[] heightArray) {
		
		String arraySizeStr;
		double nextHeight;
		String nextHeightStr;
		arraySizeStr = JOptionPane.showInputDialog(null,"How"+ "many students will you be entering hight measurements for?");
		
		int arraySize = Integer.parseInt(arraySizeStr);
		
		for(int i =0; i < arraySize; i++) {
			
			nextHeightStr = JOptionPane.showInputDialog(null,"please enter "+"your next student height in meters?");
			nextHeight = Double.parseDouble(nextHeightStr);
			heightArray[i] = nextHeight;
			
		} // end for 
		
		return heightArray;
		
		
	} // end of method
	
} // end of class
