import java.util.*;
class FindElement
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
		System.out.println("Enter the value to find : ");
		int val=sc.nextInt();
		FindElement findElement=new FindElement();
		 
		if (findElement.checkElement(val,arr))
		{
			System.out.println("Element " + val + " exists!!!");
		}
		else
		{
			System.out.println("Element " + val + " doesnot exists!!!");
		}		 
	}
	public boolean checkElement(int val,int[] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i] == val)
			{
				return true;
			}			
		}
		return false;
	}	
}