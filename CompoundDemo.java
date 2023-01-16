
public class CompoundDemo {

	public static void main(String[] args) {
		
		int num1 = -5;
		int num2 = 8;
		
		if (num1 > 1 && num2++ > 5) {		// Shortcut AND
			System.out.println("true");
		}else{
			System.out.println("false");
		}

		System.out.println(num2);
		
		boolean value = true;
		System.out.println(!value);		// NOT invert bang 
		
		System.out.println( true ^ true);   // XOR  shift and 6
		System.out.println( true ^ false);
		System.out.println( false ^ true); 
		System.out.println( false ^ false);
	}

}
