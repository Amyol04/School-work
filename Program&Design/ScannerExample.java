import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		
		Scanner scannerO= new Scanner(System.in);
		
		System.out.println("Please input your name");
		
		String input = scannerO.next();
		
		System.out.println("Name you input is: "+input);
		
		scannerO.close();

	}

}

