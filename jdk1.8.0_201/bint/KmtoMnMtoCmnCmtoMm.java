import java.util.Scanner;
class KmtoMnMtoCmnCmtoMm
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner (System.in);
  System.out.print("Put Your Kilo-Meters > ");
  int Km=obj.nextInt();
  System.out.println("Here Are Your Meters > "+(Km*1000));
  System.out.println("If You Want To Know In Centimeters, Then Give Kilo-Meters Below");
  System.out.print("Put Your Kilo-Meters > ");
  int K=obj.nextInt();
  System.out.println("Your Centimeters Here > "+(K*100*1000));
  System.out.println("If You Want To Know In Mili-Meters, Then Give Kilo-Meters Below");
  System.out.print("Put Your Kilo-Meters > ");
  int Kmm=obj.nextInt();
  System.out.print("Your Mili-Meters Here > "+(Kmm*10*100*1000));
 }
}