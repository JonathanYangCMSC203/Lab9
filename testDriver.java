
public class testDriver {

	//Test area: remember to delete
	public static void main(String args[])
	{
		SavingsAccount a = new SavingsAccount("Jo", 2000);
		System.out.println("a: " + a.getAccountNumber());//Should return 100001-0
		SavingsAccount b = new SavingsAccount (a, 2000);
		System.out.println("b: " + b.getAccountNumber());//Should return 100001-1
		SavingsAccount c = new SavingsAccount (b, 2000);
		System.out.println("c: " + c.getAccountNumber());//Should return 100001-2
		
		System.out.println();
		
		SavingsAccount d = new SavingsAccount("Jo", 2000);
		System.out.println("d: " + d.getAccountNumber());//Should return 100002-0
		SavingsAccount e = new SavingsAccount(d, 2000);
		System.out.println("e: " + e.getAccountNumber());//Should return 100002-1
		SavingsAccount f = new SavingsAccount(e, 2000);
		System.out.println("f: " + f.getAccountNumber());//Should return 100002-2
	}
}
