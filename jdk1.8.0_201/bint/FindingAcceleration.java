import java.util.Scanner;
class FindingAcceleration
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Give Values And Get Acceleration");
  System.out.println("");
  System.out.print("Put Your Value Of Mass Here > ");
  int M=obj.nextInt();
  System.out.print("Put Your Value Of Force Here > ");
  int F=obj.nextInt();
  System.out.println("Here Is Your Acceleration > "+ (M/F));
 }
}