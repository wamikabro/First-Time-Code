import java.util.Scanner;
class GtoKg
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Give your Grams here > ");
  int G=obj.nextInt();
  System.out.print("Here is/are your Kg/Kgs > "+ (G/1000));
 }
}