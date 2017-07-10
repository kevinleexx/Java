public class Withdraw extends Tranaction {
	private Account account;

	public Withdraw(Account account) {
		super(account);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void amendBalance(int amount) {
		// TODO Auto-generated method stub
		super.account.setBalance(super.account.getBalance() - amount);
	}

}
