package Basics;

public class FibonnaciApp {
	public static void main(String[] args) {
		System.out.println("Fib 0 " + fib(0));
		System.out.println("Fib 1 " + fib(1));
		System.out.println("Fib 2 " + fib(2));
		System.out.println("Fib 3 " + fib(3));
		System.out.println("Fib 4 " + fib(4));
		System.out.println("Fib 5 " + fib(5));
		System.out.println("Fib 6 " + fib(6));
		
	}
	
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		return(fib(n-1) + fib(n-2));
	}
	

}
