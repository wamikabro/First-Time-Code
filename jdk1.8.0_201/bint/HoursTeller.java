import java.util.Scanner;
class HoursTeller
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner (System.in);
  System.out.print("Tell Your Days  >");
  int D=obj.nextInt();
  System.out.println("Your Answer Below");
  System.out.println((D*24)+ " Hours");
 }
}