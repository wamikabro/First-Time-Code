import java.util.Scanner;
class SpeedTeller
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner (System.in);
  System.out.print("Put your Distance/metters here > ");
  int D=obj.nextInt();
  System.out.println("ThankYou");
  System.out.print("Put your Time/Seconds here > ");
  int S=obj.nextInt();
  System.out.print("Your Answer Here > "+ (D/S)+ " Speed");
  
 }
}