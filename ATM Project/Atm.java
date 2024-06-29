

abstract public class Atm 
{
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	abstract public double withdraw(double amount);
	abstract public double deposit(double amount);
}