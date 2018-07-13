import java.util.Scanner;
class AccelerationFinder
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("For The Acceleration Of Car Give Information");
  System.out.print("Give Your Distance Here > ");
  int D=obj.nextInt();
  System.out.print("Give Your Time Here > ");
  int T=obj.nextInt();
  System.out.print("Here Is Your Acceleration > "+ (D/T));
  System.out.println("");
  System.out.print("ThankYou Come Again!");
 }
}