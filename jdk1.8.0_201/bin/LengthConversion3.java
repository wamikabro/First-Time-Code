import java.util.Scanner;
class LengthConversion3{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Yards: ");
		int yard=obj.nextInt();
		int mile=yard/1760;
		int yards=yard%1760;
		System.out.print("Miles: "+mile+"\nYards: "+yards);
	}
}