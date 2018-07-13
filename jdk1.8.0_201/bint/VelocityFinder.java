import java.util.Scanner;
class VelocityFinder
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Without Knowing Formula Of Velocity Just Give Your Information");
  System.out.print("Give Your Displacement Here > ");
  int D=obj.nextInt();
  System.out.print("Give Your Time Here > ");
  int T=obj.nextInt();
  System.out.println("Here Is Your Velocity > "+ (D/T));
  System.out.print("ThankYou Come Again!");
 }
}