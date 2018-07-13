import java.util.Scanner;
class AccelerationOfPunch
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("For The Acceleration Of Punch Give Information :) ");
  System.out.print("Give Your Force Here > ");
  int F=obj.nextInt();
  System.out.print("Give Your Mass Here > ");
  int M=obj.nextInt();
  System.out.print("Here Is Your Acceleration > "+ (F/M));
  System.out.println("");
  System.out.print("Be With Us");
 }
}