import java.io.*;
import java.util.Scanner;
class BioData
{
	public static void main(String[]args) throws Exception
	{
		Scanner obj=new Scanner (System.in);
		DataInputStream ob=new DataInputStream(System.in);
		char a='Y';
		while(a=='Y' || a=='y')
		{
			System.out.println("\n*****Autonomy Builder*****");
		
			System.out.println("\nNote : Give Answers Directly");
		
			System.out.print("What's Your Name? : ");
			String name=ob.readLine();
		
			System.out.print("What's Your Father's Name? : ");
			String fname=ob.readLine();
		
			System.out.print("Enter Your Class : ");
			int clas=obj.nextInt();
		
			System.out.print("Whats Your Age? : ");
			int age=obj.nextInt();
			
			System.out.print("Whats Your Religion? : ");
			String religion=ob.readLine();
		
			System.out.print("Enter Your Country : ");
			String country=ob.readLine();
		
			System.out.print("Enter Country Where You Are Living : ");
			String living=ob.readLine();
			
			System.out.print("What You Want To Be? : ");
			String want=ob.readLine();
			
			System.out.print("Whats Goal Of Your Life? : ");
			String goal=ob.readLine();
			
			System.out.println("\n***Autonomy***");
			System.out.println("\nMy name is "+name+" ibne "+fname+". I study in "+clas+"th Class. I am "+age+" years old. My Religion is "+religion+". I am from "+country+" and I am living in "+living+". I want to become "+want+" and my goal of life is to "+goal+". Hopefully you will like the way of discovering myself ThankYou.");
			
			System.out.print("\nType Yes If You Want To Try Again Otherwise Type No :)\n> ");
			a=obj.next().charAt(0);
		}
		System.out.print("Thanks For Using US, Come Again Jazakallah");
	}
	
}