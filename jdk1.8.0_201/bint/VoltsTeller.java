import java.util.Scanner;
class VoltsTeller
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("To Know Volts Give Information Below");
  System.out.print("Give Your Current Here > ");
  int C=obj.nextInt();
  System.out.print("Give Your Amps Here > ");
  int A=obj.nextInt();
  System.out.println("Here Are Your Volts > "+ (C*A));
  System.out.print("Thanks For Visiting Our Program");
 }
}