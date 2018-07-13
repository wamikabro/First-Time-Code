import java.util.Scanner;
class MarkSheet
{
	public static void main(String[]arg)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("      Mark Sheet");
		System.out.print("Enter Obtained Marks of Maths >  ");
		int m=ob.nextInt();
		System.out.print("Enter Obtained Marks of Physics >  ");
		int p=ob.nextInt();
		System.out.print("Enter Obtained Marks of Islamiyat >  ");
		int i=ob.nextInt();
		System.out.print("Enter Obtained Marks of English >  ");
		int e=ob.nextInt();
		System.out.print("Enter Obtained Marks of Urdu >  ");
		int u=ob.nextInt();
		int all=(m+p+i+e+u);
		System.out.println("Here are Your Whole Marks > 500");
		System.out.println("Here are Your All Obtained Marks > "+ all);
		System.out.print("Here is Your Percentage > "+((all*100)/500)+"%");
	}
}