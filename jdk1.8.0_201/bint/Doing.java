import java.util.Scanner;
import java.io.*;
class Doing
{
	public static void main(String [] args) throws Exception
	{
		Scanner obj=new Scanner (System.in);
		DataInputStream ob=new DataInputStream(System.in);
		System.out.println("1. Start\n0. Exit");
		int w=obj.nextInt();
		do
		{
			
			switch(w)
			{
			

				case 1 :
				char a='Y';
				while(a=='y' || a=='Y')
				{
				
					System.out.print("Enter Your Name Here : ");
					String name=ob.readLine();
					System.out.println("Whats after alphabet 'A'?\n");
					String b=ob.readLine();
				
					switch(b)
					{
						case "B" :
						System.out.println("Aww Good Job "+name );
						break;
						case "b" :
						System.out.println("Aww Good Job "+name);
						break;
						default :
						System.out.println("O "+name+" you are really a loser, HaHa.");
						break;
					}	
					System.out.println("Wanna Try Again? 1. Yes or 2. No");
				
					a=obj.next().charAt(0);	
				}	
				break;
			
				case 0 :
				System.out.println("As Your Wish -__-");
				break;
			}	
		}
		while(w!=0);
	}
}