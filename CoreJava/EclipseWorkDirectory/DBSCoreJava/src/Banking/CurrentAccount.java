package Banking;

public class CurrentAccount extends BankAccount {
	
	final private String accountType = "Current";
	final Double WITHDRAW_LIMIT = 10000.0;
	final Double DEPOSIT_LIMIT = 10000.0;
	Double todayWithdrawnAmount;
	Double todayDepositAmount;
	
	public CurrentAccount() {
		
	}
	
	public CurrentAccount(String accountNumber, String customerName, String customerId, 
			Double balance, String ifscCode) {
		super(accountNumber, customerName, customerId, balance, ifscCode);
	}
	
	public String getAccountType() {
		return accountType; 
	}
	
	@Override
	protected void calculateIntrest() {
		Double balance = this.getBalance() * (1 + 0.2);
		this.setBalance(balance);
	}
	
	@Override
	public String toString() {
		return "CurrentAccount [ " + super.toString() + ", accountType=" + accountType + "]";
	}

	@Override
	public void addMoney(Double amount) throws Exception {
		if (this.todayDepositAmount >= this.DEPOSIT_LIMIT) {
			throw new DepositException(String.format("Your deposit limit for today is %s and it was exceeded.", this.DEPOSIT_LIMIT));
		} else if ((this.todayDepositAmount + amount) > this.DEPOSIT_LIMIT) {
			throw new DepositException(String.format("Your can't deposit this amount because it exceeds the limit %s. "
					+ "Your present deposit amount of today was %s", this.DEPOSIT_LIMIT, this.todayWithdrawnAmount));
		} else {
			this.setBalance(this.getBalance() + amount);
			this.todayDepositAmount += amount;
		}
	}

	@Override
	public void withdrawMoney(Double amount) throws Exception {
		if (this.todayWithdrawnAmount >= this.WITHDRAW_LIMIT) {
			throw new WithdrawException(String.format("Your withdraw limit for today is %s and it was exceeded.", this.WITHDRAW_LIMIT));
		} else if ((this.todayWithdrawnAmount + amount) > this.WITHDRAW_LIMIT) {
			throw new WithdrawException(String.format("Your can't withdraw this amount because it exceeds the limit %s. "
					+ "Your present withdrawn amount of today was %s", this.WITHDRAW_LIMIT, this.todayWithdrawnAmount));
		} else if((this.getBalance() - amount) < 0) {
			throw new WithdrawException("Insufficient funds. Please check balance.");
		} else {
			this.setBalance(this.getBalance() - amount);
			this.todayWithdrawnAmount += amount;
		}
	}
}
