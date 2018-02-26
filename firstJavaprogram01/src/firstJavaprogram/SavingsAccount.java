package firstJavaprogram;

public class SavingsAccount {
	int AcctNo;
	float Bal;
	String Type;
	
SavingsAccount(int AcctNo,float Bal,String Type){
	super();
	this.AcctNo= AcctNo;
	this.Bal=Bal;
	this.Type=Type;
}
	public Biller[] billerArray;
	public void withdrawl(int WithdrawlAmount){
		if(this.Bal>=WithdrawlAmount){
			this.Bal=this.Bal-WithdrawlAmount;
			System.out.println("The amount withdrawn is:"+WithdrawlAmount);
			System.out.print("Remaining Balance is:"+this.Bal);
		}
		else{
			System.out.println("Insufficient Balance");
		}
		
	}
	public void deposit(int DepositAmount){
		this.Bal=this.Bal+DepositAmount;
		System.out.println("Balance after deposit"+this.Bal);
	}
public void BalanceEnquiery(){
	System.out.println("The available Balance is"+this.Bal);
}
}
