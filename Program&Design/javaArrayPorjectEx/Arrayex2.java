import javax.swing.JOptionPane;

public class Arrayex2 {

	public static void main(String[] args) {
		double[] resutls; // = new double[5];
		
		String  arraySizeStr;
		
		
		arraySizeStr = JOptionPane.showInputDialog(null, "how" + "many moduals are you taking in this semester");
		
		
		int arraySize = Integer.parseInt(arraySizeStr);

		resutls = new double[arraySize];
		
	} // end main
} // end class
