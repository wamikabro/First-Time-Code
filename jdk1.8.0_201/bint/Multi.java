import java.util.Scanner;
class Multi
{
 public static void main(String[] args)
  {
   Scanner obj=new Scanner (System.in);
   System.out.print("What is the value of A?");
   int A=obj.nextInt();
   System.out.print("What is the value of B?");
   int B=obj.nextInt();
   System.out.println("This is your Answer = "+ A*B);
  }
}