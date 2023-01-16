
public class RandomNumbers {

	public static void main(String[] args) {
		
		
		System.out.println(Math.random()); // 0.0 -> 0.999999999999
		
		System.out.println(Math.random() * 10); // 0.0 -> 9.999999999
		
		System.out.println((int)(Math.random() * 10)); // 0 -> 9
		
		System.out.println((int)(Math.random() * 10) + 1); // 1 -> 10

	}

}
