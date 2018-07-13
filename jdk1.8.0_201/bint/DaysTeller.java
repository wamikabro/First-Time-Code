import java.util.Scanner;
class DaysTeller
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Hours Here > ");
  int H=obj.nextInt();
  System.out.println((H)+ " = "+ (H/24)+ " Days");
  System.out.print("Here We Go ;)");
 }
}