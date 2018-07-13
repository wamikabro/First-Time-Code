import java.util.Scanner;
class UpsideDownTable
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter The Table You Want In Up-side Down >");
		int a=obj.nextInt();
		System.out.println("\nYou Selected Table Of "+ a);
		
		for(int i=10; i>=1; i--)
		{
			System.out.println(i);
		}
		
		
	}
}