package OOP;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		System.out.println("Increase Rate");
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the term: "+ term + "years");
	}
	
	public void setSchedule() {
		System.out.println("Amortization schedule");
	}

}
