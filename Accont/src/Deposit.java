public class Deposit extends Tranaction {
	private Account account;

	public Deposit(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void amendBalance(int amount) {
		// TODO Auto-generated method stub
		super.account.setBalance(super.account.getBalance() - amount);
	}

}
