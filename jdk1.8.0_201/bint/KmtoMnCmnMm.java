import java.util.Scanner;
class KmtoMnCmnMm
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.print("Tell Your Kilo-Meters Here > ");
  int KM=obj.nextInt();
  System.out.println("Here Are Your Meters > "+ (KM*1000));
  System.out.println("Here Are Your Centi-Meters > "+ (KM*100*1000));
  System.out.println("Here Are Your Mili-Meters > "+ (KM*10*100*1000));
  System.out.println("ThankYou For Using Us :)");
 }
}