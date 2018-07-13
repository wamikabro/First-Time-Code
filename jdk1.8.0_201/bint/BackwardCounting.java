import java.util.Scanner;
class BackwardCounting
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("The Counting From 10 To "+a);
		
		for(int i=a; i>=0; i--)
		{
			System.out.println(i);
		}
	}
}