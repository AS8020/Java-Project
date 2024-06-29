package ExceptionHandling;

public class InvalidDepositException extends RuntimeException
{
	public InvalidDepositException(String s) 
	{
		super(s);
	}
}