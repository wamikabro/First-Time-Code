import java.util.Scanner;
class PercentageTeller
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Totle Amout > ");
  int Whole=obj.nextInt();
  System.out.print("Tell Gained Amount > ");
  int Gained=obj.nextInt();
  System.out.print("Here Is Your Percentage > ");
  System.out.print(Gained*100/Whole);
  System.out.print("%");
 }
}