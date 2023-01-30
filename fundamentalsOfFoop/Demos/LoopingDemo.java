
public class LoopingDemo {

	public static void main(String[] args) {
		
		// while loop
		short counter = 1;
		while(counter <= 10) {
			System.out.println(counter);
			counter++;
		}
		
		// do while loop		
		counter = 1;
		do {
			System.out.println(counter);
			counter++;
		}while(counter <= 10);
		
		// for loop
		for(counter = 1; counter <= 10; counter++) {
			System.out.println(counter);
		}
		
		int[] numbers = {1,3,5,7,9,11,13,15,17};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		// Enhanced for loop
		for (int number : numbers) {
			System.out.println(number);
		}
		
		
		
		
	}

}
