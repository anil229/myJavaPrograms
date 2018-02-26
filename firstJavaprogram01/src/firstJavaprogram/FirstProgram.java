package firstJavaprogram;

import com.Item;

public class FirstProgram {

	public static void main(String[] args) {
		
		Item item1 = new Item(1234, "edge6",400);
		Item item2 = new Item(1234, "edge6",400);
		System.out.println(item1.equals(item2));
		SavingsAccount account =new SavingsAccount(12343,43233,"Checkings");
		Biller[] billers= new Biller[3];
		billers[0] =new Biller("Naga", "Telecom", "03-02-2016");
		billers[1] =new Biller("fssd", "utility", "03-02-2016");
		billers[0] =new Biller("Naga", "insurance", "03-02-2016");
		account.billerArray = billers;
		System.out.println("Name of biller "+billers[0].getBillerType());
	


		
		JrSavingsAccount acct = new JrSavingsAccount(4556,65550,"savings","Naga");
  	JrSavingsAccount acct2 = new JrSavingsAccount(1114,30303,"savings","Sai");		
		SavingsAccount acct1 = new SavingsAccount(126,65550,"saving");
		acct1.AcctNo = 126; 
		acct1.Bal = 655500;
		acct1.Type = "saving";
		System.out.println(acct1.AcctNo);
		System.out.println(acct1.Bal);
		System.out.println(acct1.Type);
		
		SavingsAccount acct21 = new SavingsAccount(321,7438,"checking");
		acct21.AcctNo=345;
		acct21.Bal=78505;
		acct21.Type="checking";
		
		System.out.println(acct21.AcctNo);
		System.out.println(acct21.Bal);
		System.out.println(acct21.Type);
		
	acct1.withdrawl(200);
	acct21.deposit(400);
		acct1.BalanceEnquiery();
	}

}
