import java.util.Scanner;
class Ages
{
 public static void main(String[]args)
 {
    Scanner obj=new Scanner (System.in);	
	System.out.println("    Compare the ages");
	System.out.print("\nEnter The 1st Age \n");
	int f=obj.nextInt();
	System.out.print("Enter The 2nd Age ");
	int s=obj.nextInt();
	System.out.println("The 1st Age Is "+ f);
    System.out.println("The 2nd Age IS "+ s);
 }
}