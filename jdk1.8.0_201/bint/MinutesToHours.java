import java.util.Scanner;
class MinutesToHours
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Put Minutes Here > ");
  int M=obj.nextInt();
  System.out.print("Here Are Your Hours > "+ (M/60)+ " Hours");
 }
 
}