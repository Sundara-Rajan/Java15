import java.util.*;
class CashDispenser
{
	
	public int amount =0;
	public int denomination =0;
	
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);
		CashDispenser cashDispenser = new CashDispenser();
		System.out.println("Welcome to State Bank of India");
		String rptTransaction="Y";
		int pin =0;
		int accOption =0;
		while ( rptTransaction .equals("Y") )
		{
			System.out.println("Enter Pin : ");
			System.out.println("Select the Account Type Below : Enter 1 or 2");
			System.out.println("1. Savings Account");
			System.out.println("2. Current Account");
			accOption = sc.nextInt();
			switch(accOption) 
			{
				case 1 :
					cashDispenser.savingsAccount();
					break;
				case 2 :
					cashDispenser.currentAccount();
					break;
				default :
					System.out.println("Invalid Option !! Please enter correct option");
			}
			System.out.println("Do you want to repeat the transaction (Y/N) : ");
			rptTransaction =sc.next();
		}
		System.out.println("Thank you for using our ATM!!!! ");	
	}

	public void savingsAccount() 
	{	
		Scanner scan= new Scanner(System.in);
		int sBalance=1000;
		int opt =0;
		System.out.println("Savings Account");
		System.out.println("Enter the amount ( Multiples of 100 's ): ");
		amount=scan.nextInt();
		System.out.println (amount % 100);
		if (amount > sBalance )
		{
			System.out.println (" Account has insufficent Balance !!");
		}
		else if (amount == 0)
		{
			System.out.println (" Invalid Amount !!");
		}
		else if ((amount % 100) != 0)
		{
			System.out.println (" Invalid Amount !!");
		}
		else 
		{	
			if (amount < 500)
			{
				for (int i=100 ; i<=amount ; i=i+100 )
				{
					System.out.println (100);	
				}
			}
			else 
			{
				opt=getDenominations ();
				if ( opt == 1 )
				{
					for (int i=100 ; i<=amount ; i=i+100 )
					{
						System.out.println (100);	
					}
				}
				else if (opt == 2)
				{
					for (int i=500 ; i<=amount ; i=i+500 )
					{
						System.out.println (500);	
					}
					if (amount % 500 != 0)
					{
						for (int i=amount-500 ; i>=100 ; i=i-100 )
						{
							System.out.println (100);	
						}
					}
				}
			}	
		}
	}
	public void currentAccount() 
	{
		Scanner scan= new Scanner(System.in);
		int cBalance=1000;
		int opt=0;
		System.out.println("Savings Account");
		System.out.println("Enter the amount (Multiples of 100 's ): ");
		amount=scan.nextInt();
		if (amount > cBalance )
		{
			System.out.println (" Account has insufficent Balance !!");
		}
		else if (amount == 0)
		{
			System.out.println (" Invalid Amount !!");
		}
		else if ((amount % 100) != 0)
		{
			System.out.println (" Invalid Amount !!");
		}
		else 
		{
			if (amount < 500)
			{
				for (int i=100 ; i<=amount ; i=i+100 )
				{
					System.out.println (100);	
				}
			}
			else 
			{
				opt=getDenominations ();
				if ( opt == 1 )
				{
					for (int i=100 ; i<=amount ; i=i+100 )
					{
						System.out.println (100);	
					}
				}
				else if (opt == 2)
				{
					for (int i=500 ; i<=amount ; i=i+500 )
					{
						System.out.println (500);	
					}
					if (amount % 500 != 0)
					{
						for (int i=amount-500 ; i<=amount ; i=i+100 )
						{
							System.out.println (100);	
						}
					}
				}
			}
			
		}
	}
	public int getDenominations () 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Select the Required Denominations: Enter 1 or 2");
		System.out.println("1. 100 ");
		System.out.println("2. 500 ");
		denomination = scan.nextInt();
		if (denomination  > 2 || denomination < 1) 
		{
			System.out.println("Invalid Denomination!!!");
		}
		return denomination ;
	}
}