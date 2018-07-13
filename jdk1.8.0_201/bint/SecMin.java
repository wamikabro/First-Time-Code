import java.util.*;
class SecMin
{
	public static void main(String []args)
	{
		Scanner ob=new Scanner(System.in);
			
		System.out.println("\t\n\nConversion");
		System.out.println("\t\n\nEnter Seconds ");
		int sec=ob.nextInt();
		
		int mint=sec/60;
	
		System.out.println("\n\n\tTotal Mints are  "+mint);

		
		System.out.println("\t\n\nEnter Mints ");
		int mints=ob.nextInt();
		
		int secs=mint*60;
	
	
		System.out.println("\n\n\tTotal Seconds are  "+secs);
		
	}
}