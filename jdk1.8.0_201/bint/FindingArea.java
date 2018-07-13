import java.util.Scanner;
class FindingArea
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Lets Find Area");
  System.out.print("Whats Length Of Area? ");
  int L=obj.nextInt();
  System.out.print("Whats Width of Area? ");
  int W=obj.nextInt();
  System.out.println("Here Is Your Area > "+ (L*W));
 }
}