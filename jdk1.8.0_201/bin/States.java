class States{
	public static void main(String[]args){
		
		System.out.println("Star Pattern");
		int a, b, c, d, e, f, g; 
		for(g=1; g<=21; g++)
		{
			System.out.print("*");			
		}
		System.out.println();
		for(a=1; a<=10; a++)
		{
			for(b=10; b>=a; b--)
			{
				System.out.print("*");
			}
			for(c=2; c<=a; c++)
			{
				System.out.print(".");
			}
			for(d=1; d<=a; d++)
			{
				System.out.print(".");
			}
			for(e=10; e>=a; e--)
			{
				System.out.print("*");
			}
			System.out.println();			
		}
		for(f=1; f<=21; f++)
		{
			System.out.print("*");			
		}
		
	}
}