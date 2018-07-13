import java.util.Scanner;
class OneToTen
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		System.out.println("The Counting From 0 To "+a);
		
		for(int i=0; i<=a; i++)
		{
			System.out.println(i);
		}
	}
}