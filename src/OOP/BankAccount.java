package OOP;

public class BankAccount implements IRate {
	String AccountNumber;
	// Static belongs to the class not obj instance
	// final >> constant >> often used with static
	private static final String routingNumber = "6556";
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	//Constructors are unique methods
		//1. define setup initialize properties
		//2. Constructors are Implicitly called upon instantiation 
		//3. Constructors have no return type
		//4. Same name as the class
	BankAccount() {
		System.out.println("New Account");
	}
	
	//Overloading is calling the same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("New Account "+accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("New Account "+accountType + " Initial Deposit of: " +initDeposit);
		String msg = null;
		if(initDeposit <1000) {
			msg = "Error: Mimimum deposit $1000 required";
			
		}
		else {
			msg = "Thanks for initial deposit of " + initDeposit;
			balance += initDeposit;
		}
		System.out.println(msg);
	}
	
	
	//Getters or Setters
	//Allow user to define name
	public void setName(String name) {
		this.name = "Mr." + name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	//Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}

	//Define methods
	void deposit(double amount) {
		balance += amount;
		showActivity("DEPOSIT");
	}
		
	void withdraw(double amount) {
		balance -= amount;
		showActivity("WITHDRAW");
		
	}
	void checkBalance() {
		System.out.println("Balance is: " + balance);
	}
	void getStatus() {
		
	}
	private void showActivity(String activity) {
		System.out.println("Your recent activity: " + activity);
		System.out.println("Updated balance: "+ balance);
	}
	@Override
	public String toString() {
		return "[Name: " + name + " . Account Number: " + AccountNumber + " . Routing Number " + routingNumber + "Balance: $"  + balance + " ]";
	}

}
