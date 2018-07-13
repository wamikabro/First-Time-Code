import java.util.Scanner;
class HoursToDaysnWeeks
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Hours Here > ");
  int H=obj.nextInt();
  System.out.println((H)+ " = "+ (H/24)+ " Days");
  System.out.println((H)+ " = "+ (H/24/7)+ " Week/s");
 }
}