
public class SavingsAccount extends BankAccount{
	private double rate = .025;
	private int savingsNumber = 0; 
	private String accountNumber;
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber++;
	}
	public SavingsAccount(SavingsAccount oldSavingAcc, double amount)
	{
		super(oldSavingAcc, amount);
		accountNumber = super.getAccountNumber() + "-" + oldSavingAcc.savingsNumber++; 
		
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
