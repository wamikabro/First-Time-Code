import java.util.Scanner;
class WeightConversion1{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Grams: ");
		int gram=obj.nextInt();
		int kilogram=gram/1000;
		int grams=gram%1000;
		System.out.print("Kilograms: "+kilogram+"\nGrams: "+gram);
	}
}