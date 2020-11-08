
public class testDriver {

	//Test area: remember to delete
	public static void main(String args[])
	{
		CheckingAccount a = new CheckingAccount("Jon", 1000);
		System.out.println("a " + a.withdraw(500));
		SavingsAccount b = new SavingsAccount("Jo", 2000);
		System.out.println("b " + b.getAccountNumber());
		SavingsAccount c = new SavingsAccount("Jo", 2000);
		System.out.println("c " + c.getAccountNumber());
		SavingsAccount d = new SavingsAccount(c, 2000);
		System.out.println("d " + d.getAccountNumber());
		
		SavingsAccount e = new SavingsAccount("jo", 2000);
		System.out.println("e " + e.getAccountNumber());
		SavingsAccount f = new SavingsAccount(e, 2000);
		System.out.println("f " + f.getAccountNumber());
		SavingsAccount g = new SavingsAccount(f, 2000);
		System.out.println("g " + g.getAccountNumber());
		SavingsAccount h = new SavingsAccount(d, 2000);
		System.out.println("h " + h.getAccountNumber());
	}
}
