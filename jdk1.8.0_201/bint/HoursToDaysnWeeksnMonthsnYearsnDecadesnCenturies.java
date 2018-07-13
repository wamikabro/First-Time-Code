import java.util.Scanner;
class HoursToDaysnWeeksnMonthsnYearsnDecadesnCenturies
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Hours Here > ");
  int H=obj.nextInt();
  System.out.println((H)+ " = "+ (H/24)+ " Day/s");
  System.out.println((H)+ " = "+ (H/24/7)+ " Week/s");
  System.out.println((H)+ " = "+ (H/24/30)+ " Month/s");
  System.out.println((H)+ " = "+ (H/24/30/365)+ " Year/s");
  System.out.println((H)+ " = "+ (H/24/30/365/10)+ " Decade/s");
  System.out.println((H)+ " = "+ (H/24/30/365/100)+ " Century/ies");
  }
}