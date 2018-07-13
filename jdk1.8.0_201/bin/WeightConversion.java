import java.util.Scanner;
class WeightConversion{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Milligrams: ");
		int milligram=obj.nextInt();
		int gram=milligram/1000;
		int milligrams=milligram%1000;
		System.out.print("Grams: "+gram+"\nMilligrams: "+milligrams);
	}
}