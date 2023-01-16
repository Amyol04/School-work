
public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person("Tom Jones", 99);
		
		Person p2 = new Person("Olly Murs");
		p2.setAge(35);
		
		Person p3 = new Person("Jessie J");
		p3.setAge(22);
		
		Person p4 = p1;
		
		p4.setName("Will.i.am");
	}
}