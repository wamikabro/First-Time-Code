import java.util.Scanner;
class SecondsToMinutes
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Seconds Here > ");
  Double S=obj.nextDouble();
  System.out.println((S)+ " = "+ (S/60)+ " Minute/s");
  }
}