import java.util.Scanner;
class AmpsTeller
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("To Know Amps Give Information Below");
  System.out.print("Give Your Current Here > ");
  int C=obj.nextInt();
  System.out.print("Give Your Volts Here > ");
  int V=obj.nextInt();
  System.out.println("Here Are Your Amps > "+ (V/C));
  System.out.print("Thanks For Visiting Our Program");
 }
}