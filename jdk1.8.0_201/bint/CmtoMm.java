import java.util.Scanner;
class CmtoMm
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Centimeters > ");
  int Cm=obj.nextInt();
  System.out.print("Your Mili-Meters Are Here > "+ (Cm*10));
 }
}