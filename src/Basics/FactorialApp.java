package Basics;

public class FactorialApp {
	public static void main(String[] args) {
		System.out.println("Fac 0: " + fac(0));
		System.out.println("Fac 1: " + fac(1));
		System.out.println("Fac 2: " + fac(2));
		System.out.println("Fac 3: " + fac(3));
		System.out.println("Fac 4: " + fac(4));
		System.out.println("Fac 5: " + fac(5));
		System.out.println("Fac 6: " + fac(6));
		System.out.println("Fac 7: " + fac(7));
		
	}
	//static int i = 1;
	public static int fac(int n) {
		
		if(n==0) {
			
			return 1;
		}
		else if(n == 1) {
			
			return 1;
		}
		//i = n * i;
		//return i;
		return fac(n-1)*n;
	}

}
