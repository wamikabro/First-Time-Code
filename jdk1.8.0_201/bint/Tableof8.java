import java.util.Scanner;
class TableOf8
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("         Table Of 8");
  System.out.println("Here You Can Get Any Step of Table Of 8");
  System.out.print("Ask Here >");
  int Step=obj.nextInt();
  System.out.print("8x");
  System.out.print(Step);
  System.out.print("="+ (Step*8));
 }
}