import java.util.Scanner;
class TrollyLoad
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("\n*****TrollyLoad*****");
		System.out.print("Enter Value of Trollies : ");
		int a=obj.nextInt();
		System.out.print("Enter Per Trolly Rent : ");
		int b=obj.nextInt();
		System.out.print("Enter Per Trolly Diesel Bill : ");
		int c=obj.nextInt();
		System.out.print("Enter Trolly Driver Pay : ");
		int d=obj.nextInt();
		System.out.print("Enter Tax Per Trolly : ");
		int e=obj.nextInt();
		int f=(b*a);
		int g=(c+d+e)*a;
		System.out.println("Total : "+f);
		System.out.println("Expenditure : "+g);
		System.out.println("Profit : "+(f-g));
		
		
	}
}