package Basics;

public class Weather {
	public static void main(String[] args) {
		int temperature = 51;
		String sunCondition = "Sunny";
		if (temperature > 80) {
			System.out.println("It's pleasant");
		}
		else if (temperature >60 && sunCondition=="Sunny") {
			System.out.println("It is a little cooler but sunny");
		}
		else if (temperature > 50 || sunCondition=="Overcast") {
			System.out.println("Cool Day");
		}
		else {
			System.out.println("Winter");
		}
		
		System.out.print("Program is ending");	
	}

}
