import java.util.Scanner;
class MltoL
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Mili-Liters > ");
  int Ml=obj.nextInt();
  System.out.print("Here Are Your Liter/s > "+ (Ml/10));
 }
}
