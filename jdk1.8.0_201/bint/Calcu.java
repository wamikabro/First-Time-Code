import java.util.Scanner;
class Calcu
{
	public static void main(String[]args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("*****Calculator*****");
		char z='Y';
		while(z=='y' || z=='Y')
		{
		
			System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
			int x=ob.nextInt();
			char t='Y';
			while(t=='y' || t=='Y')
			{
				switch(x)
				{
					case 1 :
					System.out.println("Welcome to Addition");
					System.out.print("Enter First Value : ");
					int a=ob.nextInt();
					System.out.print("Enter Second Value : ");
					int b=ob.nextInt();
					System.out.println("Answer = "+(a+b));
					break;
					case 2 :
					System.out.println("Welcome to Subtraction");
					System.out.print("Enter First Value : ");
					int c=ob.nextInt();
					System.out.print("Enter Second Value : ");
					int d=ob.nextInt();
					System.out.println("Answer = "+(c-d));
					case 3 :
					System.out.println("Welcome to Multiplication");
					System.out.print("Enter First Value : ");
					int e=ob.nextInt();
					System.out.print("Enter Second Value : ");
					int f=ob.nextInt();
					System.out.println("Answer = "+e*f);
					break;
					case 4 :
					System.out.println("Welcome to Division");
					System.out.print("Enter First Value : ");
					int g=ob.nextInt();
					System.out.print("Enter Second Value : ");
					int h=ob.nextInt();
					System.out.println("Answer = "+g/h);
					System.out.println("Reminder = "+g%h);
					break;
				}
				System.out.print("Type 'Yes' If You Want To Try Again ");
				t=ob.next().charAt(0);
			}
			System.out.print("Type 'Yes' If You Want To Back To Main Menu ");
			z=ob.next().charAt(0);
		}
	}
}	