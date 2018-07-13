import java.util.Scanner;
class Sum
{
 public static void main(String[]args)
  {
   Scanner obj=new Scanner (System.in);
   System.out.println("What is the value of A?");
   int A=obj.nextInt();
   System.out.print("What is the Value of B?");
   int B=obj.nextInt();
   System.out.println("Here is your Answer = "+ (A+B));
  }

}