package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		//acc1.name = "Roger";
		
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
		acc1.setSsn("64654654");
		System.out.println(acc1.getSsn());
		acc1.AccountNumber = "7564547";
		acc1.balance = 66454.09;
		System.out.println(acc1.toString());
		acc1.deposit(1500);
		acc1.withdraw(500);
		
		acc1.setRate();
		acc1.increaseRate();
		
		//Polymorphism through Overriding
		System.out.println(acc1.toString());
		
		//Polymorphism through Overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.AccountNumber = "766465";
		
		BankAccount acc3 = new BankAccount("Checking Account", 5000.00);
		acc2.AccountNumber = "7667554";
		acc3.checkBalance();
		
		
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000.00;
		cd1.name = "Jen";
		cd1.interestRate = "4.5";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
	}

}
