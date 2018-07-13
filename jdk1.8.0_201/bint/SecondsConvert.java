import java.util.*;
class SecondsConvert
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter Your Seconds Here > ");
		int S=obj.nextInt();
		int M=(S/60);
		int H=(M/60);
		int D=(H/24);
		int W=(D/7);
		int Mn=(W/4);
		int Y=(Mn/12);
		System.out.println("There Are "+M+" Minutes In "+S+" Seconds");
		System.out.println("There Are "+H+" Hours In "+S+" Seconds");
		System.out.println("There Are "+D+" Days In "+S+" Seconds");
		System.out.println("There Are "+W+" Weeks In "+S+" Seconds");
		System.out.println("There Are "+Mn+" Months In "+S+" Seconds");
		System.out.println("There Are "+Y+" Years In "+S+" Seconds");
		
	}
}