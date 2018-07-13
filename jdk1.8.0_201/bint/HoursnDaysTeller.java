import java.util.Scanner;
class HoursnDaysTeller
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Minutes Here > ");
  int M=obj.nextInt();
  System.out.println((M)+ " = "+ (M/60)+ " Hours");
  System.out.println((M)+ " = "+ (M/60/24)+ " Days");
  System.out.print("Enjoyed?");
 }
}