public abstract class Tranaction {
	protected final Account account;
	public static int count = 0;

	public Tranaction(Account account) {
		super();
		this.account = account;
		count++;
	}

	public abstract void amendBalance(int amount);

}
