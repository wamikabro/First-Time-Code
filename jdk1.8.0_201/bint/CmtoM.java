import java.util.Scanner;
class CmtoM
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Centimeters > ");
  int Cm=obj.nextInt();
  System.out.print("Here Are Your Meters > "+ (Cm/100));
 }
}

