
public class CrediteLimit {
	
	private int account;
	private double balance;
	private double debt;
	private double credit;
	
	public CrediteLimit(int account, double balance, double debt, double credit) {
		this.account = account;
		this.balance = balance;
		this.debt = debt;
		this.credit = credit;
	}
	
	public double creditAvaliable() {
		return credit - debt;
	}
	
	public double newBalance() {
		return balance + debt - credit;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}
	
}
