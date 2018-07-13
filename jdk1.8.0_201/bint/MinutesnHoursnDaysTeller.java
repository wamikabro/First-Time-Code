import java.util.Scanner;
class MinutesnHoursnDaysTeller
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Seconds Here > ");
  int S=obj.nextInt();
  System.out.println((S)+ " = "+ (S/60)+ " Minutes");
  System.out.println((S)+ " = "+ (S/60/60)+ " Hours");
  System.out.println((S)+ " = "+ (S/60/60/24)+ " Days");
 }
}