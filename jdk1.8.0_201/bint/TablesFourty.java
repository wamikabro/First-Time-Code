import java.util.Scanner;
class TablesFourty
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter The Table Here > ");
		int a=obj.nextInt();
		System.out.println("The Table of "+a);
		
		for(int i=1; i<=40; i++)
		{
			System.out.println(a+"X"+i+"="+a*i);
		}
	}
}