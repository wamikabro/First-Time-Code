import java.util.Scanner;
class Cond
{
	public static void main(String...args)
	{
	 Scanner obj=new Scanner(System.in);
	 System.out.print("Enter Your Hours Here > ");
	 int hours=obj.nextInt();
	 int day=hours/24;
	 int hour=hours%24;
	 System.out.print("These are "+ day+ " Days and "+hour+ (" Hours") );
	}     
}