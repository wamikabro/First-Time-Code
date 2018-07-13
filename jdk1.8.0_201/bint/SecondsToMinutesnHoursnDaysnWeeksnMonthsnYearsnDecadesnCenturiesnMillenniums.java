import java.util.Scanner;
class SecondsToMinutesnHoursnDaysnWeeksnMonthsnYearsnDecadesnCenturiesnMillenniums
{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Tell Your Seconds Here > ");
		int S=obj.nextInt();
  
		int min=S/60;
		int hour=min/60;
		int day=hour/24;
		int week=day/7;
		int month=week/4;
		int year=month/12;
  
		System.out.println((S)+ " = "+min+" Minutes");
		System.out.println((min)+ " = "+hour+" Hours");
		System.out.println((hour)+ " = "+day+" Days");
		System.out.println((day)+ " = "+week+" Weeks");
		System.out.println((week)+ " = "+month+" Months");
		System.out.println((month)+ " = "+year+" Years");
	}
}