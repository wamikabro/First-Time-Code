import java.util.Scanner;
class KgtoG
{
 public static void main(String[]args)
  {
    Scanner obj=new Scanner (System.in);
	System.out.print("Give the KiloGrams here >  ");
	int Kg=obj.nextInt();
	System.out.print("Here are your Grams >  "+ (Kg*1000));
  }
}