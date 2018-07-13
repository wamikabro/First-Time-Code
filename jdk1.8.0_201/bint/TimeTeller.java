import java.util.Scanner;
class TimeTeller
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Hours Here > ");
  int H=obj.nextInt();
  System.out.println("Here Are Your Minutes > "+ (H*60));
  System.out.print("Here Are Your Seconds > "+ (H*60*60));
  
 }
}