import java.util.Scanner;
class DistanceFinder
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Want to know Distance? Give Information Below");
  System.out.print("Give Your Speed Here > ");
  int S=obj.nextInt();
  System.out.print("Give Your Time Here > ");
  int T=obj.nextInt();
  System.out.print("Here Is Your Distance > "+ (S/T));
  System.out.println("");
  System.out.print("ThankYou Come Again!");
 }
}