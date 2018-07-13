import java.util.Scanner;
class Name
{
	 
	public static void main(String[]arg)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("What IS Your Name?");
		System.out.print("Name HERE > ");
		double name=obj.nextDouble();
		System.out.print("My Name Is "+ name);
	}
}