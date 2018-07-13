import java.util.Scanner;
class YearsConvert
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter Your Years Here > ");
		int Y=obj.nextInt();
		int S=(29030400/Y);
		int M=(S/60);
		int H=(M/60);
		int D=(H/24);
		int W=(D/7);
		int Mn=(W/4);
		System.out.println("There Are "+S+" Seconds In "+Y+" Years");
		System.out.println("There Are "+M+" Minutes In "+Y+" Years");
		System.out.println("There Are "+H+" Hours In "+Y+" Years");
		System.out.println("There Are "+D+" Days In "+Y+" Years");
		System.out.println("There Are "+W+" Weeks In "+Y+" Years");
		System.out.println("There Are "+Mn+" Months In "+Y+" Years");
		
	}
}