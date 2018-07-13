import java.util.Scanner;
class Tableses
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		char z='y';
		while(z=='y' || z=='Y')
		{
			System.out.println("Enter Any Table To Get Tables Till That");
			int a=obj.nextInt();
			for(int b=2; b<=a; b++)
			{
				for(int d=1; d<=10; d++)
				{
					System.out.println(b+"X"+d+"="+(d*b));
				}
				System.out.println();
			}
			System.out.print("Wanna Try Again? Type Yeaaaaaaaaaaaaaah!");
			z=obj.next().charAt(0);
		}
	}
}