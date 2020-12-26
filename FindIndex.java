import java.util.*;
class FindIndex
{
	public static void main (String[] args)
	{
		int[] arr=new int[5];
		arr[0] = 14;
		arr[1] = 6;
		arr[2] = 8;
		arr[3] = 10;
		arr[4] = 4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to find the index: ");
		int val=sc.nextInt();
		FindIndex findIndex=new FindIndex();
		 
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i] == val)
			{
				System.out.println("The index of the element is : "+i);
			}			
		}
			 
	}	
}