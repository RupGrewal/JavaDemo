package OOP;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + "is walking");
	}
	void eat() {
		System.out.println(name + "is eating");
	}
	void sleep() {
		System.out.println(name + "is sleeping");
	}
}

public class Demo {

	public static void main(String[] args) {
		//Instantiate an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@yahoo.com";
		person1.phone = "5647858756";
		
		//Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
	}
	
}
