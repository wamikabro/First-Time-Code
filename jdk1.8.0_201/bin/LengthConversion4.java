import java.util.Scanner;
class LengthConversion4{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Feet: ");
		int feet=obj.nextInt();
		int mile=feet/5280;
		int feets=feet%5280;
		System.out.print("Miles: "+mile+"\nFeet: "+feets);
	}
}