package Basics;

public class AverageMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Average is: " + average());
		System.out.println("Minimum is: " + min());
		System.out.println("Maximum is: " + max());
	}
	
	static int numbers[] = {5,4,6,7,2,9};
	
	static int average() {
		int add =0;
		for(int i = 0; i<numbers.length; i++) {
			add = add+numbers[i];
		}
		System.out.println("Total is: " + add);
		return (add/numbers.length);
	}
	
	static int min() {
		int min = numbers[0];
		for(int i = 0; i<numbers.length; i++) {
			if(min>numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}
	static int max() {
		int max = numbers[0];
		for(int i = 0; i<numbers.length; i++) {
			if(max<numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}

}
