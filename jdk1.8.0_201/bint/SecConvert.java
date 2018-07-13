import java.util.Scanner;
class SecConvert
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Tell Your Seconds Here > ");
		float S=obj.nextFloat();
  
		float min=S/60;
		float hour=min/60;
		float day=hour/24;
		float week=day/7;
		float month=week/4;
		float year=month/12;
  
		System.out.println(("Total seconds are "+S)+ " = "+min+" Minutes");
		System.out.println(("Total seconds are "+S)+ " = "+hour+" Hours");
		System.out.println(("Total seconds are "+S)+ " = "+day+" Days");
		System.out.println(("Total seconds are "+S)+ " = "+week+" Weeks");
		System.out.println(("Total seconds are "+S)+ " = "+month+" Months");
		System.out.println(("Total seconds are "+S)+ " = "+year+" Years");
	}
}