import java.util.Scanner; 
class BiggestNumber
{
	public static void main(String[]args)
	{
		int[] numbers=new int[3];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			numbers[i]=sc.nextInt(); // Reading each number in a separate line with for loop
		}
				
		if (numbers[0] > numbers [1])
		{
			System.out.println(numbers[0]+" is the greatest number!");
		}
		else if (numbers[1] > numbers[2])
		{
			System.out.println(numbers[1]+" is the greatest number!");
		}
		else
		{
			System.out.println(numbers[2]+" is the greatest number!");	
		}			
	}	
}