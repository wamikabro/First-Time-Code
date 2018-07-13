class printing1
{
	public static void main(String[]args)
	{
		for (char i='Z'; i>='A'; i--)
		{
			for(char j=i; j<='Z'; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}