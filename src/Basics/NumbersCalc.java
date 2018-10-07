package Basics;

public class NumbersCalc {
	public static void main(String args[]) {
		System.out.println("Program is starting");
		printName();
		
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println("Prouct is:" + multiplyNumbers(numA,numB));
	}
	
	static void printName() {
		System.out.println("Java bean");
	}
	
	static void addNumbers(int a, int b) {
		System.out.println("Sum is:" + (a+b));
	}
	
	static int multiplyNumbers(int a, int b) {
		int product = a * b;
		addNumbers(product, product);
		return product;
	}

}
