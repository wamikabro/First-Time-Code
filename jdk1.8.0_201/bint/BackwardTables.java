import java.util.Scanner;
class BackwardTables
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter The Table Here > ");
		int a=obj.nextInt();
		System.out.println("The Table of "+a);
		
		for(int i=10; i>=1; i--)
		{
			System.out.println(a+"X"+i+"="+a*i);
		}
	}
}