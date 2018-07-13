import java.util.Scanner;
class TimeFinder
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Know The Time Of Reaching By Telling Distance and Speed");
  System.out.print("Give Your Distance Here > ");
  int D=obj.nextInt();
  System.out.print("Give Your Speed Here > ");
  int S=obj.nextInt();
  System.out.print("Here Is Your Time > "+ (D/S));
  System.out.println(" Second/s");
  System.out.print("ThankYou Come Again!");
 }
}