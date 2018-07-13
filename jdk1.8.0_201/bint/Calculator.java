import java.util.Scanner;
class Calculator
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Welcome To The Little Calculaor World");
		char ch = 'Y';
		while(ch=='y' || ch=='Y')
		{
			System.out.println("\n1 for Division\n2 for Multiplication\n3 for Addition\n4 for Subtraction");
			double a=obj.nextDouble();
			
			if(a==1)
			{
				System.out.println("\n*****Division*****");
				System.out.print("\nDivisor? > ");
				double b=obj.nextDouble();
				System.out.print("Dividend? > ");
				double c=obj.nextDouble();
				System.out.println("\nYour Quotient > "+(c/b));
			}
			if(a==2)
			{
				System.out.println("\n*****Multiplication*****");
				System.out.print("\nMultiplicand? > ");
				double d=obj.nextDouble();
				System.out.print("Multiplier? > ");
				double e=obj.nextDouble();
				System.out.println("\nYour Protuct > "+(d*e));
			}
			if(a==3)
			{
				System.out.println("\n*****Addition*****");
				System.out.print("\nFirst Value? > ");
				double f=obj.nextDouble();
				System.out.print("Second Value? > ");
				double g=obj.nextDouble();
				System.out.println("\nSum > "+(f+g));
			}
			if(a==4)
			{
				System.out.println("*****Subtraction*****");
				System.out.print("\nFirst Value? > ");
				double h=obj.nextDouble();
				System.out.print("Second Value? > ");
				double i=obj.nextDouble();
				System.out.println("\nSub > "+(h-i));
			}
			System.out.println("\nIf You Want To Do Again Write 'Yes'");
			ch=obj.next().charAt(0);
		}
		System.out.println("Thanks For Using Us");
	}
}