import java.util.Scanner;
class MtoCm
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Meters > ");
  int M=obj.nextInt();
  System.out.print("Here Are Your Centimeters > "+ (M*100));
 }
}