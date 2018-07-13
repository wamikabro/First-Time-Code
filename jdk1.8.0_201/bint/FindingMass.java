import java.util.Scanner;
class FindingMass
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Here You Can Get Your Mass Without Knowing Formula");
  System.out.println("");
  System.out.println("Just give the information and get your value of Mass below");
  System.out.println("");
  System.out.print("Put the value of Force > ");
  int F=obj.nextInt();
  System.out.print("Put the value of Acceleration > ");
  int A=obj.nextInt();
  System.out.println("Here Is Your Mass > "+ (F/A)+ " Force");
  System.out.println("");
  System.out.print("Dear Users ThankYou For Being Our Users Jazakallah Khair.");
 }
 
}