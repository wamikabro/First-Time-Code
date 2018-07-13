import java.util.Scanner;
class LengthConversion{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Inches: ");
		int inch=obj.nextInt();
		int foot=inch/12;
		int foots=inch%12;
		System.out.print("Feet: "+foot+"\nInches: "+foots);
	}
}