import java.util.Scanner;
class HoursConvert
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter Your Hours Here > ");
		int H=obj.nextInt();
		int D=(H/24);
		int M=(H*60);
		int S=(M*60);
		int W=(D/7);
		int Mn=(W/4);
		int Y=(Mn/12);
		System.out.println("There Are "+S+" Seconds In "+H+" Hours");
		System.out.println("There Are "+M+" Minutes In "+H+" Hours");
		System.out.println("There Are "+D+" Days In "+H+" Hours");
		System.out.println("There Are "+W+" Weeks In "+H+" Hours");
		System.out.println("There Are "+Mn+" Months In "+H+" Hours");
		System.out.println("There Are "+Y+" Years In "+H+" Hours");
		
	}
}