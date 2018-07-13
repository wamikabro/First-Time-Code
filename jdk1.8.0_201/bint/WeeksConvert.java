import java.util.Scanner;
class WeeksConvert
{
	public static void main(String[]args)
	{
		
		Scanner obj=new Scanner (System.in);
		
		
		System.out.print("Enter Your Weeks Here > ");
		int W=obj.nextInt();
		int S=(W*604800);
		int M=(S/60);
		int H=(M/60);
		int D=(H/24);
		int Mn=(W/4);
		int Y=(Mn/12);
		System.out.println("There Are "+S+" Seconds In "+W+" Weeks");
		System.out.println("There Are "+M+" Minutes In "+W+" Weeks");
		System.out.println("There Are "+H+" Hours In "+W+" Weeks");
		System.out.println("There Are "+D+" Days In "+W+" Weeks");
		System.out.println("There Are "+Mn+" Months In "+W+" Weeks");
		System.out.println("There Are "+Y+" Years In "+W+" Weeks");
		
	}
}