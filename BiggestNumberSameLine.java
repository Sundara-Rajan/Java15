import java.util.Scanner; 
class BiggestNumberSameLine
{
	public static void main(String[]args)
	{
		String[] numbArr= null;
		int[] numbers=new int[3];
		Scanner sc=new Scanner(System.in);
		numbArr=sc.nextLine().split(" ");   // reading the 3 numbers in same line and storing in array
		for (int i=0;i<3;i++)
		{
			numbers[i]=Integer.parseInt(numbArr[i]);
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