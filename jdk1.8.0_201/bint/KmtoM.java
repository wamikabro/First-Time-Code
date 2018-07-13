import java.util.Scanner;
class KmtoM
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your KiloMeters > ");
  int Km=obj.nextInt();
  System.out.print("Here Are Your Meters > "+ (Km*1000));
 }
}