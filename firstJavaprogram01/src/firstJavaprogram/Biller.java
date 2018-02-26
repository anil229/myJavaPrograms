package firstJavaprogram;

public class Biller {
	private String BillerName;
	private String BillerType;
	private String BillingDate;
	
	public Biller() {
		// TODO Auto-generated constructor stub
	}

	public Biller(String billerName, String billerType, String billingDate) {
		super();
		BillerName = billerName;
		BillerType = billerType;
		BillingDate = billingDate;
	}

	public String getBillerName() {
		return BillerName;
	}

	public void setBillerName(String billerName) {
		BillerName = billerName;
	}

	public String getBillerType() {
		return BillerType;
	}

	public void setBillerType(String billerType) {
		BillerType = billerType;
	}

	public String getBillingDate() {
		return BillingDate;
	}

	public void setBillingDate(String billingDate) {
		BillingDate = billingDate;
	}

}
