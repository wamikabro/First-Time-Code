import java.util.Scanner;
class StorageChart
{
 public static void main(String[]args)
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Tell your Perabytes and know all Bytes/Bits");
  System.out.println("");
  System.out.print("Tell Your Perabytes Here >>> ");
  double Pb=obj.nextInt();
  System.out.println("Here are your Terabytes(Tb) > "+ (Pb*1024));
  System.out.println("Here are your Gigabytes(Gb) > "+ (Pb*1024*1024));
  System.out.println("Here are your Megabytes(Mb) > "+ (Pb*1024*1024*1024));
  System.out.println("Here are your Kilobytes(Kb) > "+ (Pb*1024*1024*1024*1024));
  System.out.println("Here are your Bytes  (Byte) > "+ (Pb*1024*1024*1024*1024*1024));
  System.out.println("Here are your Bits   (Bit)  > "+ (Pb*1024*1024*1024*1024*1024*8));
  System.out.print("Niddles(N)>"+ (Pb*1024*1024*1024*1024*1024*8*2));
  
 }
}
