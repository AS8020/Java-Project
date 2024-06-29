
package ExceptionHandling;

public class InsufficientBalanceException extends RuntimeException 
{
	public InsufficientBalanceException(String s) 
	{
		super(s);
	}
}