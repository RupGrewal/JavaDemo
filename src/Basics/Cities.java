package Basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare and define an array
		String cities[] = {
				"New York",
				"SF",
				"Toronto",
				"Miami"
				};
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		
		//Declare an array and define its size only
		String[] states = new String[5];
		System.out.println(states.length);
		
		for(int i=0; i<=states.length-1; i++) {
			String state = "State 1";
			states[i] = state + (i+1);
			System.out.println(states[i]);
		}
		
		//Declare an array
		String countries[];
		
		//Define array size
		countries = new String[3];
		
		//Define array content
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		int i =0;
		
		//Do while enters loop and then test condition
		do {
			System.out.println(countries[i]);
			i = i+1;
		} while(i < countries.length);
		
		//While loop tests condition and then enters loop
		System.out.println("***************");
		
		int n =0;
		String state = states[3];
		System.out.println(state);
		boolean statefound = false;
		while(!statefound) {
			String state1 = states[n];
			if(state==state1) {
				System.out.println("State at " +n +": " + states[n]);
				statefound = true;
			}
			
			n++;
		}
	}

}
