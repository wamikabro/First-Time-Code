import java.util.Scanner;
class MinutestoSeconds
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner (System.in);
  System.out.print("Tell me your Minute/s here > ");
  int M=obj.nextInt();
  System.out.print("Here are your Minutes > "+ (M*60));
 }
}