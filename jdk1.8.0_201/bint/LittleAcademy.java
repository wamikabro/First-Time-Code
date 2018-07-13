import java.util.Scanner;
class LittleAcademy
{
	public static void main(String[]args)
	{
		Scanner ob=new Scanner(System.in);
		char a='Y';
		while(a=='Y' || a=='y')
		{
			System.out.println("Welcome To Little Academy");
			System.out.print("1 Calculator\n2 Designs\nChoise Here > ");
			int b=ob.nextInt();
			if(b==1)
			{
				System.out.println("\nWelcome To Calculator");
			}
			if(b==2)
			{
				System.out.println("\nWelcome To Designs");		
			}
			System.out.println("Wanna Try Again, Yes or No?");
			a=ob.next().charAt(0);
			
		}
}	}