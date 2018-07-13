import java.util.Scanner;
class DaysToWeeksnMonths
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Days Here > ");
  int D=obj.nextInt();
  System.out.println((D)+ " = "+ (D/7)+ " Weeks");
  System.out.println((D)+ " = "+ (D/30)+ " Months");
 }
}