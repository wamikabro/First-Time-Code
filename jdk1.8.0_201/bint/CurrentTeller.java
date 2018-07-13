import java.util.Scanner;
class CurrentTeller
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("To Know Current Give Information Below");
  System.out.print("Give Your Volts Here > ");
  int V=obj.nextInt();
  System.out.print("Give Your Amps Here > ");
  int A=obj.nextInt();
  System.out.println("Here Are Your Amps > "+ (V/A));
  System.out.print("Thanks For Visiting Our Program");
 }
}