import java.util.Scanner;
class SquareRoot
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Here You Can Get Square-Root Of Any Number You Want");
  System.out.println("");
  System.out.print("Give Value And Get The Square Of It >>> ");
  int V=obj.nextInt();
  System.out.println("Your Answer Below");
  System.out.print("Square-Root Of ");
  System.out.print(V);
  System.out.print(" Is "+ (V*V));
 }
}