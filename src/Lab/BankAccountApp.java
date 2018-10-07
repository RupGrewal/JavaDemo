package Lab;

public class BankAccountApp {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("34755656", 1000);
		BankAccount acc2 = new BankAccount("56568678", 2000);
		BankAccount acc3 = new BankAccount("97766567", 2500);
		
		acc1.setName("Roger");
		System.out.println("Name is: " + acc1.getName());
		acc1.deposit(500.00);
		acc1.deposit(5500);
		acc1.payBill(330.67);
		acc1.accrue();
		System.out.println(acc1.toString());
		}

}

class BankAccount implements IInterest {
	//Properties
	private static int iD = 1000;					//Internal ID
	private String accountNumber; 	// ID + random 2-digit number + first 2 SSN
	private static final String routingNumber = "00450076";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructors
	public BankAccount(String SSN, double initDeposit){
		balance = initDeposit;
		System.out.println("New Account Created");
		this.SSN = SSN;
		iD++;
		setAcccountNumber();
		}
	private void setAcccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your account number is: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		System.out.println("---- Paying Bill ---- " + amount);
		balance-=amount;
		showBalance();
	}
	
	public void deposit(double amount) {
		System.out.println("---- Making Deposit ---- " + amount);
		balance+=amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance is: " + balance);
	}
	
	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance * (1+rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		
		return "[ Name: " +name + " ]\n[ Account Number: " +accountNumber + "]\n[ Routing Number: " + routingNumber + " ]\n[ Balance: "+balance+ " ]";
	}

	
 }
