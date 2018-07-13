import java.util.Scanner;
class MmtoCm
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner (System.in);
  System.out.print("Tell Your Mili-Meters > ");
  int Mm=obj.nextInt();
  System.out.print("Here are Your Centimeters > "+(Mm/10));
 }
}
