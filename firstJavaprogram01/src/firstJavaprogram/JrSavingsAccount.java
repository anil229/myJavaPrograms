package firstJavaprogram;

public class JrSavingsAccount extends SavingsAccount {
	String GaurdianName;
	
	public JrSavingsAccount(int AcctNo, float Bal, String Type, String gaurdianName) {
		super(AcctNo, Bal, Type);
		GaurdianName = gaurdianName;
	}

}
