import java.util.Scanner;
class AccelerationOfStunt
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("For The Acceleration Of Stunt Give Information");
  System.out.print("Give Your Velocity Here > ");
  int V=obj.nextInt();
  System.out.print("Give Your Time Here > ");
  int T=obj.nextInt();
  System.out.print("Here Is Your Acceleration > "+ (V/T));
  System.out.println("");
  System.out.print("ThankYou Come Again!");
 }
}