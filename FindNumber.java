import java.util.Scanner;

class FindNumber
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		//Approach 1
		if (number >0)
		{
			System.out.println("Given Number "+number+" is positive number ! ");
		}
		else if (number <0)
		{
			System.out.println("Given Number "+number+" is Negative number ! ");
		}
		else
		{
			System.out.println("Given Number "+number+" is neither positive nor negative number ! ");	
		}	
		//Approach 2--
		if (String.valueOf(number).contains("-"))
		{
			System.out.println("Given Number is Negative number ! ");
		}
		else if (number == 0)
		{
			System.out.println("Given Number "+number+" is neither positive nor negative number ! ");
		}
		else
		{
			System.out.println("Given Number "+number+" is positive number ! ");	
		}	
	}	
}