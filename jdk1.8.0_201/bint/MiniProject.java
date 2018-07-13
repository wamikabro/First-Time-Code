import java.util.Scanner;
import java.io.*;
class MiniProject
{
	public static void main(String args[]) throws Exception
	{
		Scanner obj=new Scanner (System.in);
		DataInputStream ob=new DataInputStream (System.in);
		
		System.out.println("1. Calculator\n2. Alphabets\n3. Exit");
		int a=obj.nextInt();
		do
		{
			switch(a)
			{
				case 1 :
				char b='y';
				while(b=='Y' || b=='y')
				{
					System.out.println("\t\tCALCULATOR\n\n1. Addition\n2. Subtraction");
					int d=obj.nextInt();
					switch(d)
					{
						case 1 :
						System.out.print("First Value : ");
						int e=obj.nextInt();
						System.out.print("Second Value : ");
						int f=obj.nextInt();
						System.out.println("Answer : "+(e+f));
						break;
						
						case 2 :
						System.out.print("First Value : ");
						int g=obj.nextInt();
						System.out.print("Second Value : ");
						int h=obj.nextInt();
						System.out.println("Answer : "+(g+h));
						break;
					}
					System.out.print("Want to perform operation again? Yes/No : ");
					b=obj.next().charAt(0);
				}
				break;
				
				case 2 :
				char c='Y';
				while(c=='Y' || c=='y')
				{
					System.out.println(" Subtraction");
					int d=obj.nextInt();
					switch(d)
					{
						case 1 :
						System.out.print("First Value : ");
						int e=obj.nextInt();
						System.out.print("Second Value : ");
						int f=obj.nextInt();
						System.out.println("Answer : "+(e+f));
						break;
						
						case 2 :
						System.out.print("First Value : ");
						int g=obj.nextInt();
						System.out.print("Second Value : ");
						int h=obj.nextInt();
						System.out.println("Answer : "+(g+h));
						break;
					}
					System.out.print("Want to perform operation again? Yes/No : ");
					b=obj.next().charAt(0);
					
					
					
					
					
					
					
				}
			}
		}
		while(a!=3);
	}
}