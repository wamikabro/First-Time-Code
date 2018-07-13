class printing
{
	public static void main(String[]args)
	{	
		for (char i='A'; i<='Z'; i++)
		{
			for(char j=i; j<='Z'; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}