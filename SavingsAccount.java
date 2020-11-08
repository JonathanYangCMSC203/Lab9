
public class SavingsAccount extends BankAccount{
	private double rate = .025;
	private int savingsNumber = 0; 
	private String accountNumber;
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	
	//This is the copy constructor. What it should do is add 1 to savingsNumber each time 
	public SavingsAccount(SavingsAccount oldSavingAcc, double amount)
	{
		super(oldSavingAcc, amount);
		this.savingsNumber = oldSavingAcc.savingsNumber;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	public void postInterest()
	{
		super.setBalance(getBalance()* (1 + rate * (1.0/12.0)));
	}
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}	
}
