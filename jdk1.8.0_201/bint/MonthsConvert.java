import java.util.Scanner;
class MonthsConvert
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter Your Months Here > ");
		int Mn=obj.nextInt();
		int S=(Mn*2419200);
		int M=(S/60);
		int H=(M/60);
		int D=(H/24);
		int W=(D/7);
		int Y=(Mn/12);
		System.out.println("There Are "+S+" Seconds In "+Mn+" Months");
		System.out.println("There Are "+M+" Minutes In "+Mn+" Months");
		System.out.println("There Are "+H+" Hours In "+Mn+" Months");
		System.out.println("There Are "+D+" Days In "+Mn+" Months");
		System.out.println("There Are "+W+" Weeks In "+Mn+" Months");
		System.out.println("There Are "+Y+" Years In "+Mn+" Months");
		
	}
}