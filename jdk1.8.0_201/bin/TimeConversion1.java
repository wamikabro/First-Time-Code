import java.util.Scanner;
class TimeConversion1{
	public static void main(String[]args){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Minutes: ");
		int minute=obj.nextInt();
		int hour=minute/60;
		int minutes=minute%60;
		System.out.print("Hours: "+hour+"\nMinutes: "+minutes);
	}
}