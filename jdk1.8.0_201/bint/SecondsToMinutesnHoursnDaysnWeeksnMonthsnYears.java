import java.util.Scanner;
class SecondsToMinutesnHoursnDaysnWeeksnMonthsnYears
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Seconds Here > ");
  Double S=obj.nextDouble();
  System.out.println((S)+ " = "+ (S/60)+ " Minute/s");
  System.out.println((S)+ " = "+ (S/60/60)+ " Hour/s");
  System.out.println((S)+ " = "+ (S/60/60/24)+ " Day/s");
  System.out.println((S)+ " = "+ (S/60/60/24/7)+ " Week/s");
  System.out.println((S)+ " = "+ (S/60/60/24/30)+ " Month/s");
  System.out.println((S)+ " = "+ (S/60/60/24/30/365)+ " Year/s");
  }
}