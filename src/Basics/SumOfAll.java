package Basics;

public class SumOfAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		System.out.println("Sum of all numbers in " + num + " is: " +sum(num));

	}
	
	static int sum(int n) {
		int add = 0;
		for(int i=n; i>0; i--) {
			add = add+i;
		}
		return add;
	}

}
