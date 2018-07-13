import java.util.Scanner;
class MomentumFinder
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Without Knowing Formula Of Momentum Just Give Your Information");
  System.out.print("Give Your Mass Here > ");
  int M=obj.nextInt();
  System.out.print("Give Your Velocity Here > ");
  int V=obj.nextInt();
  System.out.println("Here Is Your Momentum > "+ (M*V));
  System.out.print("ThankYou Come Again!");
 }
}