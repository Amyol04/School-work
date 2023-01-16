public class SwitchDemo {

	public static void main(String[] args) {
		
		int age = 22;
		
		switch(age) {
		case 1:	System.out.println("walking");
			break;
		case 2: System.out.println("talking");
			break;
		case 4: System.out.println("go to school");
			break;
		case 17:
		case 18: System.out.println("go to college");
			break;
		case 22: System.out.println("get a job");
			break;
		default:
			System.out.println("You are not 1, 2, 4, 18 or 22");
		}
		
		
		
		String result;
		
		result = age >= 18? "You can vote" : "You are too young to vote";
		
		System.out.println(result);
		
		
		
		result = age == 1 ? "walking" : age == 2 ? "talking" : age == 4 ? "go to school" : age == 17 || age == 18 ? "go to college" : 
			age == 22 ? "get a job" : "You are not 1, 2, 4, 18 or 22";
		System.out.println(result);
		
	}

}
