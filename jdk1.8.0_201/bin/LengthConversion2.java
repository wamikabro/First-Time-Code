import java.util.Scanner;
class LengthConversion2{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Inches:");
		int inch=obj.nextInt();
		int yard=inch/36;
		int yardd=inch%36; 
		System.out.print("Yards: "+yard+"\nInches: "+yardd);
	}
}