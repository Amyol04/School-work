/**
 * 
 * @author 23.amyoleary
 *Triangle area class will calculate the area of my triangle given the user inputs of side A, side b AND ANGLE. 
 */
public class Triangle {
	public static void main(String[] args) {
	
		double sideA = 10.2;
		double sideb =12.6;
		double angleA = 70.8;
	
		double lenghtSum = (sideA * sideb) * 0.5;
		double sinSum = Math.sin(angleA);

		// using the formula, calculates the area.
		double trangleArea = lenghtSum *sinSum;

		System.out.println("Area of the triangle is:" +trangleArea);
		
	} //end of main
} // end of class
