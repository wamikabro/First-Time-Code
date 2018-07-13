import java.util.Scanner;
class FindingForce
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Want to know force, but dont know the formula?");
  System.out.println("Just give the information and get your value of Force below");
  System.out.println("");
  System.out.print("Put the value of Mass > ");
  int M=obj.nextInt();
  System.out.print("Put the value of Acceleration > ");
  int A=obj.nextInt();
  System.out.println("Here Is Your Force > "+ (M*A)+ " Force");
  System.out.println("");
  System.out.print("Dear Users ThankYou For Visiting Us");
 }
 
}