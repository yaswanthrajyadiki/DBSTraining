package Banking;

abstract public class BankAccount {
	
	private String accountNumber;
	private String customerName;
	private String customerId;
	private Double balance;
	private String ifscCode;
	
	
	public BankAccount() {
		
	}
	
	public BankAccount(String accountNumber, String customerName, String customerId, 
			Double balance, String ifscCode) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.customerId = customerId;
		this.balance = balance;
		this.ifscCode = ifscCode;
	}
	
	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	protected void calculateIntrest() {
		this.balance = this.balance * (1 + 0.5);
	}
	
	abstract public void addMoney(Double amount) throws Exception;
	
	abstract public void withdrawMoney(Double amount) throws Exception;
	
	abstract public String getAccountType();

	@Override
	public String toString() {
		return "accountNumber=" + accountNumber + ", customerName=" + customerName + ", customerId="
				+ customerId + ", balance=" + balance + ", ifscCode=" + ifscCode;
	}

}
