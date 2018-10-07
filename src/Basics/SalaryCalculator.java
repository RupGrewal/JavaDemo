package Basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create variable to define career
		
		// Declare variable
		String career;
		System.out.println("Program is starting");
		
		career = "Software Dev";
		
		System.out.println(career);
		
		int hoursPerWeek = 40;
		double rate = 40.5;
		int weeksPerYear = 50;
		
		double salary = hoursPerWeek * rate * weeksPerYear;
		System.out.println("My salary as a " +career + " at rate " + rate + "is " +salary);
	
		career = "Web Dev";
		System.out.println("My salary as a " +career + " at rate " + rate + "is " +salary);
	}

}
