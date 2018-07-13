import java.util.Scanner;
class HourstoMinutes
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Put Hours Here > ");
  int H=obj.nextInt();
  System.out.print("Here Are Your Minutes > "+ (H*60)+ " Minutes"); 
 }
}