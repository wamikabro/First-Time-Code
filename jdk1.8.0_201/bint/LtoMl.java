import java.util.Scanner;
class LtoMl
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Liters > ");
  int L=obj.nextInt();
  System.out.print("Here Are Your Mili-Liters > "+ (L*10));
 }
}