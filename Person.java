
public class Person {
	
	private String name;  // instance variables exist for the lifetime of the object
	private int age;
	
	private static int numOfPeople; // Class variable, only one will ever exist
	/*
	Person(){
		super();
	}
	*/
	Person(String newName){						// Overloaded constructors
		super();								// Same name as class
		setName(newName);						// Must differ in parameter type list
	}
	
	Person(String newName, int newAge){
		setName(newName);
		setAge(newAge);
	}
		
	void setName(String newName) {
		if(newName != null && !name.equals("")) {
			name = newName;
		}
	}
	
	void setAge(int newAge) { // method parameters exist only for the duration of the method
		if (newAge >= 0) {
			age = newAge;
		}
		int retirementAge = 65; // local variable exists from declared to end of method
		if(age >= retirementAge)
			System.out.println("Consider retiring");
	}
}