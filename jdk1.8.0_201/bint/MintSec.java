import java.util.Scanner;
class MintSec
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Minutes > ");
		float mint=obj.nextFloat();
		float sec=mint*60;
		System.out.println("Your Seconds Are > "+ sec);
		System.out.print("Enter Seconds > ");
		float secs=obj.nextFloat();
		float mins=secs/60;
		System.out.println("Your Minutes Are > "+ mins);
	}
}