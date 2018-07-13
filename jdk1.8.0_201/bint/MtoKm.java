import java.util.Scanner;
class MtoKm
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Meters > ");
  int M=obj.nextInt();
  System.out.print("Here Are Your Kilo-Meters > "+ (M/1000));
 }
}