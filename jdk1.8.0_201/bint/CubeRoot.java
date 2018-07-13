import java.util.Scanner;
class CubeRoot
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Give Value And Get CubeRoot Faster");
  System.out.println("");
  System.out.print("Give Your Value HERE > ");
  int V=obj.nextInt();
  System.out.print("CubeRoot of ");
  System.out.print(V);
  System.out.print(" is "+ (V*V*V));
 }
}