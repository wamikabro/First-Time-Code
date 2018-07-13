import java.util.Scanner;
class DayConvert
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter Your Days Here > ");
		int D=obj.nextInt();
		int H=(D*24);
		int M=(H*60);
		int S=(M*60);
		int W=(D/7);
		int Mn=(W/4);
		int Y=(Mn/12);
		System.out.println("There Are "+S+" Seconds In "+D+" Days");
		System.out.println("There Are "+M+" Minutes In "+D+" Days");
		System.out.println("There Are "+H+" Hours In "+D+" Days");
		System.out.println("There Are "+W+" Weeks In "+D+" Days");
		System.out.println("There Are "+Mn+" Months In "+D+" Days");
		System.out.println("There Are "+Y+" Years In "+D+" Days");
		
	}
}