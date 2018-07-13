import java.util.Scanner;
class Matero
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		
		char ch='y';
		while(ch=='y'||ch=='Y')
		{
			System.out.println("\n*****Calculate*****");
			System.out.print("\nEnter First Value > ");
			double b=obj.nextDouble();
			System.out.print("\nEnter Second Value > ");
			double c=obj.nextDouble();
			
			System.out.println("***Select Operator***");
			System.out.println("\nDivide(/), Multiply(*), Addition(+), Subtraction(-)");
			char d=obj.next().charAt(0);

			if(d=='/')
			{
				System.out.println("**Division**");
				System.out.println(b+" / "+c+" = "+(b/c));
			}
			if(d=='*')
			{
				System.out.println("**Multiplication**");
				System.out.print(b+" * "+c+" = "+(b*c));

			}
			if(d=='+')
			{
				System.out.println("**Addition**");
				System.out.print(b+" + "+c+" = "+(b+c));

			}
			if(d=='-')
			{
				System.out.println("**Subtraction**");
				System.out.print(b+" - "+c+" = "+(b-c));

			}
				System.out.println("\nType Yes To ReUse Program");
				ch=obj.next().charAt(0);
		}
	}
}