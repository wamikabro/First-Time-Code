import java.util.Scanner;
class VolumeConversion{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Milliliters: ");
		int milliliter=obj.nextInt();
		int liter=milliliter/1000;
		int milliliters=milliliter/1000;
		System.out.print("Liter: "+liter+"\nMilliliters: "+milliliters);
	}
}