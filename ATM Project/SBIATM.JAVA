
public class SBIATM extends Atm
{

	@Override
	public double withdraw(double amount)throws InsufficientBalanceException,InvalidWithdrawException
	{
		if(amount>=getBalance())
		{
			if(amount%2000==0)
			{
				double updated_amount = getBalance()-amount;
				setBalance(updated_amount);
				return updated_amount;
			}
			else
			{
				throw new InvalidWithdrawException("Invalid amount to withdraw ");
			}
		}
		else
		{
			throw new InsufficientBalanceException("Insufficient balance");
		}
	}

	@Override
	public double deposit(double amount)throws InvalidDepositException 
	{
		if(amount%500==0)
		{
			double updated_balance = getBalance()+amount;
			setBalance(updated_balance);
			return updated_balance;
		}
		else
		{
			throw new InvalidDepositException("Invalid amount to deposit");
		}
	}
	
}