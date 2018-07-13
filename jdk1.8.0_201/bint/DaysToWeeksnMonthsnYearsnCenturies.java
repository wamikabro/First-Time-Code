import java.util.Scanner;
class DaysToWeeksnMonthsnYearsnCenturies
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Days Here > ");
  int D=obj.nextInt();
  System.out.println((D)+ " = "+ (D/7)+ " Week/s");
  System.out.println((D)+ " = "+ (D/30)+ " Month/s");
  System.out.println((D)+ " = "+ (D/365)+ " Year/s");
  System.out.println((D)+ " = "+ (D/365/100)+ " Century/ies");
 }
}