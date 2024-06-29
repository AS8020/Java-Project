package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmMain 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ICICIATM i = new ICICIATM() ;
		SBIATM s = new SBIATM();
		boolean flag = false;
		while(!flag)
		{
			
			System.out.println("===========");
			System.out.println("1.ICICI");
			System.out.println("2.SBI");
			System.out.println("3.Exit");
			System.out.println("============");
			try
			{
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1:
					{
						System.out.println("1.Withdraw");
						System.out.println("2.Deposit");
						try
						{
							int ch1 = sc.nextInt();
							switch(ch1)
							{
								case 1:
								{
									System.out.println("How much amount");
									try
									{
										double amount = sc.nextDouble();
										try
										{
											i.withdraw(amount);
										}
										catch(InvalidWithdrawException e)
										{
											
											System.err.println(e.getMessage());
										}
										catch(InsufficientBalanceException e)
										{
											System.out.println(e.getMessage());
										}
									}
									catch(InputMismatchException e)
									{
										System.out.println("Invalid input");
									}
								}break;
								
								case 2:
								{
									System.out.println("How much amount");
									try
									{
										double amount = sc.nextDouble();
										try
										{
											i.deposit(amount);
										}
										catch(InvalidDepositException e)
										{
											System.err.println(e.getMessage());
										}
	
									}
									catch(InputMismatchException e)
									{
										System.out.println("Invalid input");
									}
								}break;
								
								default:
								{
									System.out.println("Invalid option");
								}
								
							}
						}
						catch(InputMismatchException e)
						{
							System.out.println("Invalid input");
						}
					}break;
					
					case 2:
					{
						System.out.println("1.Withdraw");
						System.out.println("2.Deposit");
						try
						{
							int ch1 = sc.nextInt();
							switch(ch1)
							{
								case 1:
								{
									System.out.println("How much amount");
									try
									{
										double amount = sc.nextDouble();
										try
										{
											s.withdraw(amount);
										}
										catch(InvalidWithdrawException e)
										{
											System.err.println(e.getMessage());
										}
									}
									catch(InputMismatchException e)
									{
										System.out.println("Invalid input");
									}
								}break;
								
								case 2:
								{
									System.out.println("How much amount");
									try
									{
										double amount = sc.nextDouble();
										try
										{
											s.deposit(amount);
										}
										catch(InvalidDepositException e)
										{
											System.err.println(e.getMessage());
										}
									}
									catch(InputMismatchException e)
									{
										System.out.println("Invalid input");
									}
								}break;
								
								default:
								{
									System.out.println("Invalid option");
								}
								
							}
						}
						catch(InputMismatchException e)
						{
							System.out.println("Invalid input");
						}
					}break;
					
					case 3:
					{
						flag = true;
					}break;
					
					default:
					{
						System.out.println("Invalid option");
					}
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input");
				
			}
		}
		
		System.out.println("THANK YOUU!!!! VISIT AGAINN....");

	}

}