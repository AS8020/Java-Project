package ExceptionHandling;

public class InvalidWithdrawException extends RuntimeException
{
	public InvalidWithdrawException(String s) 
	{
		super(s);
	}
}