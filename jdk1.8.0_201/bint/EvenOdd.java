import java.util.Scanner;
class EvenOdd
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Any Number Here > ");
		int num=obj.nextInt();
		
		if(num%2==0)
		{
			System.out.print("Your Number Is Even");
		}
		
		else
		{
			System.out.println("Your Number Is Odd");
		}
		
		System.out.print("ThankYou For Visiting!");
	}
}