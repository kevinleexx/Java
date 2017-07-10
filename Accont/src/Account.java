public class Account {
	private int balance;
	private final String name;
	private final String AccNo;

	public Account(int balance, String name, String accNo) {
		super();
		this.balance = balance;
		this.name = name;
		AccNo = accNo;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
