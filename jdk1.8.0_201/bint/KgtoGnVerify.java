import java.util.Scanner;
class KgtoGnVerify
{
 public static void main(String args [])
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Kg Amount > ");
  int Kg=obj.nextInt();
  System.out.println("Here are your Grams > "+ (Kg*1000));
  System.out.print("To verify Tell Grams Here > ");
  int G=obj.nextInt();
  System.out.println("Match it with your Kg > "+ (G/1000));
 }
}