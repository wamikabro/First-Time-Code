import java.util.Scanner;
class Min
{
	public static void main(String[]args)
	{
	 Scanner obj=new Scanner(System.in);
	 System.out.print("Enter Your Minutes Here > ");
	 int minutes=obj.nextInt();
	 int hour=minutes/60;
	 int minute=minutes%24;
	 System.out.print("These are "+ hour+ " Hours and "+minute+ (" Minutes") );
	}     
}