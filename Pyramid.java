class Pyramid
{
	public static void main(String[] args)
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (int a=5;a>=1;a--)
		{
			for (int b=a;b>=1;b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}