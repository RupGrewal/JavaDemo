package Basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		bookTitle = "The Lord of the Rings";
		String wordChoice = "Ring";
		
		if (bookTitle.contains((wordChoice))) {
			System.out.println("Contanins Ring");
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("It is Chrome");
		}
		
		String fname = "Tim";
		String lname = "Short";
		String SSN = "12345678";
		
		System.out.println("There are " + SSN.length() + " digits in SSN");
		
		System.out.println(fname.substring(0,1));
		System.out.println(lname.substring(0,1));
		System.out.println(SSN.substring(4));
	}

}
