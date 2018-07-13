import java.util.Scanner;
class LengthConversion1{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Feet: ");
		int feet=obj.nextInt();
		int yard=feet/3;
		int yardd=feet%3;
		System.out.print("Yards: "+yard+"\nFeet: "+yardd);

	}
}