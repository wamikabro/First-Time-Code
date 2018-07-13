import java.util.Scanner;
class GreaternLess
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Tell Your Number Here > ");
		int num=obj.nextInt();
		
		if(num>0)
		{
			System.out.println("This Is Positive Number");
		}
		
		else
		{
			System.out.println("This Is Negative Number");
		}
	}
	
}